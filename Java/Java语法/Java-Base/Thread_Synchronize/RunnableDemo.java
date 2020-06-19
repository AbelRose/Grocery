package cn.sherlock.Thread_Synchronize;

public class RunnableDemo {
    public static void main(String[] args) {
        //主线程
        System.out.println("RunnableDemo:"+Thread.currentThread().getName());

        //在mian里面创建一个子任务对象
        SubRunnable sr = new SubRunnable();
        //创建一个Thread类的对象 并且把任务对象传递给Thread里面的构造方法里面去
        Thread t = new Thread(sr);

        t.start();
    }
}
