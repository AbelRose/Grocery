package cn.sherlock.Exception_Thread;

public class Practice_9 {
    /*
    多线程
        Q:创建多线程对象，
        开启多线程。
        在子线程中输出1-10之间的偶数，
        在主线程输出1-10之间的奇数。


    创建多线程的时候也要先定义一个线程类
     */
    public static void main(String[] args) {
        //在线程里面判断偶数
        MyThread th = new MyThread();
        th.start();//调用start方法()
        //再主方法里面判断奇数
        for (int i = 1; i <= 10; i++) {
            if(i%2 != 0){
                System.out.println(i+":是奇数");
            }
        }

    }

}
