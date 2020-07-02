### 多线程

一个进程至少有一个线程(main()线程)

怎么理解多线程? 工厂中有很多生产线 迅雷同时下载很多视频

多线程可以共享内容,充分利用CPU 对于一个核CPU 每个时刻只能执行一个线程

Java提供两种方式

***方式一***

```java
public class ThreadFor1 extends Thread{
	public void run() { // 重写run方法
		for (int i = 0; i < 50; i++) {
			System.out.println(this.getName()+":"+i);
		}
	}
}
```

注意这是一个类(extends Thread) 可以直接***new***  然后掉哟个start执行线程

***方式二***

实现Runnable()***接口***

注意这是一个接口 ***implements*** Runnable 实现run方法

```java
public class RunnableFor1 implements Runnable{
	public void run() {
		for (int i = 51; i < 100; i++) {
 			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
```

Thread th1 = new Thread(new Runnable()); 然后调用start方法执行线程

------

### 线程安全

经典案例-火车票

```java
public class SaleWindow implements Runnable {
    private int id = 10; //表示 10 张火车票 这是共享资源

    //卖 10 张火车票
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (id > 0) {
                System.out.println(Thread.currentThread().getName() + "卖了编号为" + id + "的火车票");
                id--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
```

会出现重复售票的情况(因为火车票是共享资源 而线程之间是彼此独立的)

解决线程安全问题-同步锁机制(简单来说，就是给某些代码加把锁)

- 同步代码块
- 同步方法

注意多个线程必须使用同一把锁(对象) 上述两种方法本质上是一样的,需要给谁加上锁就在它上面加上同步锁

***同步代码块***  - synchronized(锁){...业务代码...}

```java
public class SaleWindow1 implements Runnable {
    private int id = 10; //表示 10 张火车票 共享资源

    //卖 10 张火车票
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) { // 注意这个锁是同一个资源this
                if (id > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖了编号为" + id + "的火车票");
                    id--;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
```

***同步方法*** - public synchronized void saleOne() {业务代码块}; (抽取出一个方法)

```java
public class SaleWindow2 implements Runnable {
    private int id = 10; // 表示 10 张火车票 共享资源

    public synchronized void saleOne() { //该方法内是上面同步代码块中的代码
        if (id > 0) {
            System.out.println(Thread.currentThread().getName() + "卖了编号为" + id + "的火车票");
            id--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    // 卖 10 张火车票
    public void run() {
        for (int i = 0; i < 10; i++) {
            saleOne(); // 直接调用
        }
    }
}
```

------

### 线程间通信

***等待唤醒机制***

wait() 和 notify()

有时候我们希望它们能有规律的执行, 那么，多线程之间就需要一些协调通信来改变或控制 CPU 的随机性。

同步锁相当于***中间人***的作用，多个线程必须用***同一个同步锁***(认识同一个中间人)，只有同一个锁上的被等待的线程，才可以被持有该锁的另一个线程唤醒，使用不同锁的线程之间 不能相互唤醒，也就无法协调通信。

Java 在 Object 类中提供了一些方法可以用来实现线程间的协调通信，我们一起来了解 一下：

- public final void wait(); 让当前线程释放锁 

- public final native void wait(long timeout); 让当前线程释放锁，并等待 xx 毫秒

- public final native void notify(); 唤醒持有同一锁的某个线程 

- public final native void notifyAll(); 唤醒持有同一锁的所有线程

注意:在调用notify()和wait() 时 必须时同一个锁.

案例一:

一个线程输出 10 次 1，一个线程输出 10 次 2，要求交替输出“1 2 1 2 1 2...”或“2 1 2 1 2 1...”

```java
package com.abelrose;

public class MyLock { // 锁
    public static Object o = new Object();
}
```

为了保证两个线程使用的一定是同一个锁，我们创建一个对象作为静态属性放到一个类中， 这个对象就用来充当锁。 

```java
package com.abelrose;

//定义一个线程类 输出1
public class ThreadForNum1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (MyLock.o) {
                System.out.println(1);
                MyLock.o.notify(); //唤醒另一个线程
                try {
                    MyLock.o.wait(); //让自己休眠并释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

注意顺序:先是对业务加锁,然后业务部分,之后是notify(),最后wait()  -  每个等待唤醒机制都是这样

```java
package com.abelrose;

//定义一个线程类 输出1
public class ThreadForNum2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (MyLock.o) {
                System.out.println(2);
                MyLock.o.notify();  //唤醒另一个线程
                try {
                    MyLock.o.wait(); //让自己休眠并释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

```java
package com.abelrose;

import java.util.ArrayList;

public class TestForNum {
    public static void main(String[] args) {
    /**
    * 谁在上面就先执行哪个 1 2 1 2 ...(2 1 2 1 2 ...)
    */
        new ThreadForNum1().start(); 
        new ThreadForNum2().start();
    }
}
```

案例二:

生产者消费者模式(线程间通信的经典应用)

该模式的关键之处是如何处理多线程之间的协调通信，内存缓冲区为空的时候，消费者必须等待， 而内存缓冲区满的时候，生产者必须等待，其他时候可以是个动态平衡。

```java
public class Kuang {
	//这个集合就是水果筐 假设最多存 10 个水果
	public static ArrayList<String> kuang = new ArrayList<String>();
}
```

上述代码定义一个静态集合作为内存缓冲区用来存储数据，同时这个集合也可以作为锁去被 多个线程使用。

农夫

```java
package com.abelrose;

public class Farmer extends Thread {
    public void run() {
        while (true) {
            synchronized (Kuang.kuang) {
                //1.筐放满了就让农夫休息
                if (Kuang.kuang.size() == 10) {
                    try {
                        Kuang.kuang.wait();
                    } catch (InterruptedException e) {
                    }
                }
                //2.往筐里放水果
                Kuang.kuang.add("apple");
                System.out.println("农夫放了一个水果,目前筐里有" + Kuang.kuang.size()
                        + "个水果");
                //3.唤醒小孩继续吃
                Kuang.kuang.notify();
            }
            //4.模拟控制速度
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
```

小孩

```java
package com.abelrose;
public class Child extends Thread {
    public void run() {
        while (true) {
            synchronized (Kuang.kuang) {
                //1.筐里没水果了就让小孩休息
                if (Kuang.kuang.size() == 0) {
                    try {
                        Kuang.kuang.wait();
                    } catch (InterruptedException e) {
                    }
                }
                //2.小孩吃水果
                Kuang.kuang.remove("apple");
                System.out.println("小孩吃了一个水果,目前筐里有" + Kuang.kuang.size() + "个水果");
                //3.唤醒农夫继续放水果
                Kuang.kuang.notify();
            }
            //4.模拟控制速度
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

```

```java
public class TestFarmerChild {
	public static void main(String[] args) { new Farmer().start(); new Child().start();
	}
}
```















