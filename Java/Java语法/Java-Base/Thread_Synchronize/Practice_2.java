package cn.sherlock.Thread_Synchronize;

public class Practice_2 {
    /*
    创建多线程
    Q:请描述创建线程的两种方式
    A:
        1.将类声明为Thread的子类
            1)定义Thread类的子类，并重写该类的run()方法，该run()方法的方法体就代表了线程需要完成的任务,因此把run()方法称为线程执行体。
            2)创建Thread子类的实例，即创建了线程对象
            3)调用线程对象的start()方法来启动该线程
        2.声明一个类实现Runnable接口
            1)定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
            2)创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，Thread对象才是真正的线程对象
            3)调用线程对象的start()方法来启动线程
     */
}
