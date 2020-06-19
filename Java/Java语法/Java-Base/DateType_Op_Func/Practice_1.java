package cn.sherlock.DateType_Op_Func;

public class Practice_1 {
    /*
    * 编写步骤：

    1. 定义类 Test1
    2. 定义 main方法
    3. 定义两个byte类型变量b1,b2,并分别赋值为10和20.
    4. 定义变量b3,保存b1和b2的和,并输出.
    5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
    6. 定义变量s3,保存s1和s2的和,并输出.
    7. 定义一个char类型变量c1赋值为'a',一个int类型变量i1赋值为30.
    8. 定义变量ch3,保存c1和i1的差,并输出.
    *
     */
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(c1);
        int i1 = 30;
        int ch3 = c1 - i1;// -0 就是将一个字符类型转变为 int类型
        System.out.println(ch3);

        int a = 1;
        String s = a + "";
        System.out.println(s);

        boolean bol = s instanceof String;
        System.out.println(bol);
    }
}
