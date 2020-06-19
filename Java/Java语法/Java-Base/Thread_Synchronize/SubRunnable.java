package cn.sherlock.Thread_Synchronize;

public class SubRunnable implements Runnable {
    //搞一个Runnable的实现类 然后重写run方法
    @Override
    public void run() {
        System.out.println("SubRunnable"+Thread.currentThread().getName());
    }
}
