package cn.sherlock.Object_API;

public class ToStringTest{
    static int i = 1;
    public static void main(String args[]){
        System.out.println("love " + new ToStringTest());//love java
        ToStringTest a = new ToStringTest();
        a.i++;
        System.out.println("me " + a.i);//me 2
    }
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }
}
    /*
    原因：当执行代码的时候，首先加载静态变量，
    然后执行main方法，
    由于main方法内部第一行代码为输出语句，
    里面new了此类对象，
    当执行此行代码时会先创建了本类的对象，
    由于此类重写了toString方法，
    会先执行toString方法的打印输出，
    然后返回“java ”，再执行main方法第一行打印输出
    。在Java中“System.out.println(类对象名);
    ”实际输出的是该对象的toString()方法返回的字符串，
    即括号中的内容等价于类对象名.toString(),toString方法
    的好处是在碰到println方法的时候会被自动调用，不用显示的写出来。
     */