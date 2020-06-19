package cn.sherlock.ThreadPooling_Lambda;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice_7 {
    /*
    线程池的练习
    Q:
    使用线程池创建多线程。模拟同学找老师学习Java。
    1.创建线程池对象，包含2个线程。从线程池中获取线程对象，然后调用MyRunnable中的run()。
    2.在MyRunnable实现类中，首先在控制台打印需求，“我需要一个老师”。模拟需要2秒钟时间老师可以过来指导学生，并在控制台打印老师的姓名。最后，在控制台打印“教我java,教完后，老师回到了办公室”；
     */
    public static void main(String[] args) {
        //创建一个线程池对象
        //其中里面包含两个线程
        ExecutorService service = Executors.newFixedThreadPool(2);
        //创建一个Runnable实例对象
        MyRunnable r = new MyRunnable();
        //从线程池里面调用两个对象 并执行
        service.submit(r);
        service.submit(r);
        //最后关闭
        service.shutdown();//submit方法调用结束后 程序并不停止 因为线程池控制了线程的关闭

        //注意！！！！将使用完的线程又归还给线程池
    }
}
