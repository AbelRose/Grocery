package cn.sherlock.Thread_Synchronize;

public class ThreadDemo {
    public static void main(String[] args) {
        //子线程
        SubThread st = new SubThread();
        st.start();
        //再创建一个进程
        SubThread st1 = new SubThread();
        st1.start();
        //父线程
        System.out.println("main:"+Thread.currentThread().getName());
    }
}
