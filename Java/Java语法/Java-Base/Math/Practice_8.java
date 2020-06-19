package cn.sherlock.Math;

import java.util.Scanner;

public class Practice_8 {
    /*
    # 扩展题目

    ## 第八题：需求实现

    - 模拟简单计算器，可以运算+，—，*，/，%。

      - 接收三个参数，一个整数，一个运算符，另一个整数。
      - 计算出运算结果。
      - 无法运算时，返回null。

    - 代码实现，效果如图所示：

      ![](img\8.jpg)
     */

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入两个数字以及运算符:");
        int a = sc1.nextInt();
//        Scanner sc2 = new Scanner(System.in);
        String op = sc1.next();//把这个nextLine()换成next() 就可以在一行内输入
//        Scanner sc3 = new Scanner(System.in);
        int b = sc1.nextInt();
        //也可以分别创建三个Scanner 创建三个不同的对象

        cal(a, op, b);

    }

    public static void cal(int a, String op, int b) {
        int res = 0;

        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                System.out.println("null");
        }
        System.out.println("结果是: " + res);
    }
}

//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt();
//    String next = scanner.next();
//    int b = scanner.nextInt();
//    String count = count(a, next, b);
//    System.out.println(a +next +b +"="+count);
//}
//
//    public static String count(int a, String op , int b ){
//        int r=0;
//        if ("+".equals(op)){
//            r = a+b;
//        }else  if ("-".equals(op)){
//            r = a-b;
//        }else  if ("*".equals(op)){
//            r = a*b;
//        }else  if ("/".equals(op)){
//            r = a/b;
//        }else  if ("%".equals(op)){
//            r = a%b;
//        }else {
//            return null;
//        }
//
//        return r+"";
//    }
//
//}
