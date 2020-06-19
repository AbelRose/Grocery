package cn.sherlock.InternalClass;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;

public class Practice_1 {
    /*
    * 定义HandleAble接口，具备一个处理字符串数字的抽象方法方法HandleString（String num）。
  * 处理方式1：取整数部分。
  * 处理方式2：保留指定位小数，四舍五入。
* 代码实现，效果如图所示：
  ![](img\1.jpg)
* 开发提示：
  * 匿名内部类的方式，调用所有抽象方法。
     */
    public static void main(String[] args) {
        String str = "23.23456789";
        System.out.println("源字符串为:"+str);

        //处理方式一 取整数部分
        HandleAble h1 = new HandleAble() {
            @Override
            public String handleString(String str) {
                String substring = str.substring(0, str.indexOf("."));
                System.out.println("取整后的结果为:"+substring);
                return substring;
            }
        };
        String s = h1.handleString(str);

        //处理小数 保留至指定位销书 四舍五入
        HandleAble h2 = new HandleAble() {
            @Override
            public String handleString(String str) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入要保留的位数:");
                int num = sc.nextInt();

//                String s1 = str.substring(0, str.indexOf("."));
//
//                String s2 = str.substring(str.indexOf(".")+1,num+3);
//
////                System.out.println(s2);
//
//                String s3 = str.substring(num + 3, str.length());
////                System.out.println(s3);
//
//
//                char[] cs2 = s2.toCharArray();
//
//                char[] cs3 = s3.toCharArray();
//                if(cs3[0] <= '4'){
//                    cs2[cs2.length-1] = '0';
//                }else {
//                    cs2[cs2.length-1] += '1';
//                }
//
//
//
//
//                System.out.println(s1+"."+s2);
//                return s1+s2+s3;

                int i = str.indexOf(".") + 1 + num;
                char c = str.charAt(i);
                System.out.println(c);

                if(c <= '4'){//注意是单引号的4
                    return str.substring(0,i).toString();
                }else {
                    char c1 = (char)(str.charAt(str.indexOf(".")+num+1));
                    return str.substring(0,i-1)+c1;
                }
//
//                String ss = h2.handleString(str);
//                System.out.println("保留"+num+"位小数后:"+ss);

            }
        };

        h2.handleString(str);
    }
}



//Answer
/*
public class Test1 {

    public static void main(String[] args) {

        String str = "23.23456789";
        System.out.println("原数字字符串:" + str);

        HandleAble s1 = new HandleAble() {
            @Override
            public String handleString(String str) {
                return str.substring(0, str.indexOf("."));
            }
        };
        String string = s1.handleString(str);

        System.out.println("取整后:" + string);

        int num = 4;

        HandleAble s2 = new HandleAble() {
            @Override
            public String handleString(String str) {

                int i = str.indexOf(".") + num + 1;
                char c = str.charAt(i);
                //System.out.println(c);

                if (c <= '4') {
                    return str.substring(0, i).toString();
                } else {
                    char c1 = (char) (str.charAt(str.indexOf(".") + num) + 1);
                    return str.substring(0, i - 1) + c1;

                }
            }
        };
        String sss = s2.handleString(str);
        System.out.println("保留" + num + "位小数后:" + sss);

    }
}
interface HandleAble {
    public abstract String handleString(String str);
}
 */
