import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;

//public class Practice_6 implements Runnable{
    /*
    多线程
    Q:问题：给出以下代码，请问该程序的运行结果是什么?如有问题，请说明原因。
    public class Test07implements Runnable {
    public static void main(String[] args) {
      Thread t = new Thread(new Test07());
      t.start();
     }

    public void run(int num) {
    for (int i = 0; i < num; i++) {
       System.out.println(i);
      }
     }
    }
     */
    /**
     *public class Practice_6 implements Runnable{
     * public static void main(String[] args) {
     *         Thread t = new Thread(new Practice_6());
     *         t.start();
     *     }
     *
     *     public void run(int num){
     *         for (int i = 0; i < num; i++) {
     *             System.out.println(i);
     *         }
     *     }
     *
     */
    //编译的时候 就报错了呢 因为没有重写run方法 下面那个不是重写run方法 注意run方法的参数刘表是空的 不带参数


