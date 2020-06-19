package cn.sherlock.Exception_Thread;

public class MyThread extends Thread {
    @Override
    public void run(){//重写run方法
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 0){
                System.out.println(i+":是偶数");
            }
        }
    }
}
