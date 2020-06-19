package cn.sherlock.Thread_Synchronize;

public class SubThread extends Thread {
    @Override
    public void run() {
        //用Thread.currentThread().getName()这个方法打印出线程的名字
        System.out.println("SubThread:"+Thread.currentThread().getName());
    }
}
