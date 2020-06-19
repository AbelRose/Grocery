package cn.sherlock.DateType_Op_Func;

import java.text.DecimalFormat;

public class Practice_3 {
    /*

    - 编写步骤：

  1. 定义类 Test3
  2. 定义 main方法
  3. 定义char类型变量ch,赋值为'J'
  4. 使用强制转换的方式,将变量ch转换为小写'j',并输出
  5. 定义char类型变量ch2,赋值为'a'
  6. 使用+=的方式,将变量ch2转换为大写'A',并输出
  7. 定义double类型变量d3,int类型变量i3
  8. 定义double变量sum3,保存d3与i3的和,输出sum3的值和sum3去除小数部分的值
  9. 定义double类型变量d4,int类型变量i4
  10. 定义int变量mul4,保存d4和i4乘积的整数部分,并输出

     */
    public static void main(String[] args) {


        char ch = 'J';
//        char c = Character.toLowerCase(ch);//用Character类中的toLowerCase()中的方法
//        System.out.println(c);

        int i = ch + 32;//字符型加上一个数字就变成了 int 类型
        //用i(int型的)接受结果 所以是int类型
        //+32 就从小写的变成大写的了

//        System.out.println(i);
        char c = (char) i;//将int类型强制转换为(char)类型
        System.out.println(c);

        System.out.println("==============");

        char ch2 = 'a';

        ch2 -= 32;//ch2 接收的 结果 所以还是 字符型的

        System.out.println(ch2);

        System.out.println("==============");


//        double d3 = 3.14;
        double pi = Math.PI;
        int i3 = 10;

        double sum3 = pi + i3;
        System.out.println(sum3);

        DecimalFormat df = new DecimalFormat("00");
        //如果是一位的 就写 一个0 如果是两位的就写两个0  表示保存 整数部分
        //但是还是强制类型转换最容易(int)
        String format = df.format(sum3);
        System.out.println(format);
//        System.out.println((int)sum3);//服~~~直接转换为int类型 就吧小数部分给去掉了呢

        System.out.println("==============");

        double d4 = pi;
        int i4 = 1;
        double d = i4 + pi;
        int i5 = (int) d;
        System.out.println(i5);

    }
}
