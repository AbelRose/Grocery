package cn.sherlock.ThreadPooling_Lambda;

public class Practice_5 {
    /*
    多线程
    Q:
    请在指定位置插入代码实现打印输出1-99。
    public class Test06 {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {
    new Test06().method();
     }
    public void method() {
    //请在此处插入代码，实现功能
    Thread t = new Thread( a );
      t.start();
     }
    }
     */
    public int start = 1;
    public int end = 99;
    public static void main(String[] args) {
        new Practice_5().method();
    }
    public void method(){

        Runnable a = ()->{//好处就是不用新建一个RunnableImpl类了呢 直接用Runnable 就行了
            for(int i = start;i <= end; i++){
                System.out.println(i);
            }
        };

        Thread t = new Thread(a);

        t.start();
    }
}
