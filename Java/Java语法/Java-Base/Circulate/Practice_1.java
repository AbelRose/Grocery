package cn.sherlock.Circulate;

import java.util.Scanner;

public class Practice_1 {
    /*

    * 编写步骤：

  1. 定义类 Test1
  2. 定义 main方法
  3. 定义变量i为0,i2为10
  4. 使用第一个while循环,当条件为`i小于5` 时,则进入循环
  5. 循环内,i自增,i2自增
  6. 循环内,使用if判断,当`i大于等于 2 ` 并且` i2小于15` 时,同时输出i和i2的值
  7. 使用第二个while循环,当条件为`i2小于20` 时,则进入循环
  8. 循环内,i自增,i2自增
  9. 循环内,使用if判断,当`i大于8 ` 或者`i2小于等于18` 时,同时输出i和i2的值

 编写步骤：

  1. 定义类 Test2
  2. 定义 main方法
  3. 定义变量 discount为1, totalPrice为550
  4. 判断当`totalPrice >=500` ,discount赋值为0.5
  5. 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.6
  6. 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.7
  7. 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.8
  8. 输出totalPrice.
  9. 输出totalPrice 与 discount 的积


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数字:");
//        int i = sc.nextInt();
//        String s = i + "";
//
//        switch (s){
//            case "100":
//                System.out.println("OK");
//                break;
//            default:
//                System.out.println("NO");
//        }
//
//    }
//}

    * 编写步骤

  1. 定义类 Test3
  2. 定义 main方法
  3. 使用for循环,初始化变量r为10,当`r>0`时,进入循环
  4. for循环内,定义变量c,赋值为r
  5. for循环内,使用while循环,当`c>=0`时,输出c,再将c减2赋值给c
  6. for循环内,while循环外,r除以c赋值给r


    * 编写步骤

    1. 定义类 Test4，定义 main方法
    2. main方法中,定义int类型变量 a为10,b为20,c为30
    3. 定义 method1方法, 定义变量a为-5,变量b为--a,判断a为偶数,则a赋值为++b,否则b赋值为--a.打印a,b
    4. 定义 method2方法, 定义变量a为0,使用while循环,判断a<=5,进入循环.
    5. while循环内部,使用for循环,初始化int类型变量b为1,当b<=5时进入循环, 步进表达式b++
    6. for循环内,不换行输出i并拼接" "
    7. for循环外,输出换行.
    8. j自增.
    9. main方法调用method1方法,method2方法
    10. 输出a,b,c


//
//    public static void main(String[] args) {
////        int a =10,b = 20,c = 30;
////        System.out.println(a);
////        System.out.println(b);
////        method1();
//        method2();
//    }
//
//    private static void method2() {
//        int a = 1;
////        int b = --a;
////        System.out.println(b);
////        System.out.println(--a);
//        int b = a--;
////        System.out.println(b+1);
////        System.out.println(b);
////        System.out.println(a);
////        System.out.println(a--);
////        System.out.println(--a);
//    }
//
//    private static void method1() {
//        int a = -5;
//        int b = --a;
//
//
//        if(a % 2 == 0){//是偶数
//            a = ++b;
//        }else {//不是偶数
//            b = --b;
//        }
////
////        System.out.println(a);
////        System.out.println(b);
//
////        (a % 2 == 0) ? (a = ++b) : (b = --b) ; 然而这种做法是不正确的
//
//
//
//
//
//    }

    * 编写步骤：

  1. 定义类 Test6
  2. 定义 main方法
  3. 定义字符串遍历 str,赋值为J
  4. 使用for循环,初始化变量i = 0,如果i<5进入循环,步进表达式i++
  5. for循环内部,嵌套定义变量key ,赋值为i%3;
  6. 定义switch语句 ,表达式为key.
  7. case 为0时,str拼接字符'a',i++后,break
  8. case 为2时,str拼接字符'V'
  9. 循环结束后,输出str


    * 编写步骤

  1. 定义类 Test7
  2. 定义 main方法
  3. 定义boolean类型变量,bVar为false,bVar1为true
  4. 定义int类型变量,count 为 8
  5. 使用do ... while 格式,do代码块中,输出"Hello Java!"拼接count的字符串
  6. do代码块中,使用if判断,如果count大于等于7,则bVar1赋值为false,count自减,否则count+=3.
  7. while中,当bVar与bVar1值相等并且count小于9的时候,进入循环

        */
    public static void main(String[] args) {
        boolean bVar = false;
        boolean bVar1 = true;

        int count = 8;

        do{
            System.out.println("Hello" + count);
            if(count >= 7){
                bVar1 = false;
                count--;
            }else {
                count += 3;
            }
        }while ((bVar == bVar1) && count < 9);
    }

}
