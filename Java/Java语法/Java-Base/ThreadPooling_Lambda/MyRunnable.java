package cn.sherlock.ThreadPooling_Lambda;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I need a teacher");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Teacher is coming-"+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" will go back home, Bye~~");

    }
}
