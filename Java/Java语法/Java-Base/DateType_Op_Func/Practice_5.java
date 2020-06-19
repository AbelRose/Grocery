package cn.sherlock.DateType_Op_Func;

public class Practice_5 {
    /*

    * 编写步骤：
  1. 定义类 Test5
  2. 定义 main方法
  3. 定义一个int类型变量a,变量b,都赋值为20.
  4. 定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
  5. 输出a的值,bo的值.
  6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
  7. 输出b的值,bo2的值.

     */
    public static void main(String[] args) {
        int a = 20,b = 20;
        boolean b1 = ++a % 3 == 0;//21
        boolean b2 = a++ % 7 == 0;//21

        System.out.println(a);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("==============");

        boolean b3 = b++ % 3 == 0;//20
        boolean b4 = ++b % 7 == 0;//22

        System.out.println(b);

        System.out.println(b3);
        System.out.println(b4);

    }
}
