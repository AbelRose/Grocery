package cn.sherlock.Overloading_Method;

public class Test1 {

    /*

    ## 第一题：语法练习

    * 语法点：方法定义，方法重载

    * 按步骤编写代码，效果如图所示：

      ![](img\1.jpg)

    * 编写步骤：

      1. 定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
      2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
      3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
      4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
      5. main方法中,调用printNum方法,传入a,b
      6. main方法中,调用doubling方法,传入a,b
      7. main方法中,调用printNum方法,传入a,b
      8. main方法中,调用doubling方法,传入a,用a接收返回值
      9. main方法中,调用doubling方法,传入b,用b接收返回值
      10. main方法中,调用printNum方法,传入a,b

     */

    public static void main(String[] args) {
        int a = 10, b = 10;
        printNum(a,b);
        doubling(a,b);
        printNum(a,b);
        a = doubling(a);//注意这个返回的是一个int类型的 应该用int类型的接受一下
        b = doubling(b);
        printNum(a,b);
    }

    public static void printNum(int iVar, int iVar2){
        System.out.println("Num1: "+iVar+" "+"Num2: "+iVar2);
    }

    public static void doubling(int r, int p){
        System.out.println("------翻倍后-----");
        r *= 2;
        p *= 2;
        printNum(r, p);
    }

    public static int doubling(int r){
        r *= 2;
        return r;
    }

}
