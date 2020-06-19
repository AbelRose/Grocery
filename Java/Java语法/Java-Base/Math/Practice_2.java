package cn.sherlock.Math;

import jdk.nashorn.internal.runtime.regexp.RegExp;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

public class Practice_2 {
    /*
    ## 第二题：需求实现

    * 键盘录入QQ号码，验证格式的正确性。
      * 必须是5—12位数字。
      * 0不能开头。


    * 代码实现，效果如图所示：

     ![](img\2.jpg)

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的号码: ");
        String qq = sc.nextLine();
        boolean flag = true;
        while (flag) {
            if (qq.startsWith("0") || qq.length() < 5 || qq.length() > 12) {
                System.out.println("输入错误! 重新输入");
                Scanner scpro = new Scanner(System.in);//重新new一个新的对象！！！ 赋值给qq
                qq = scpro.nextLine();
            } else {
                System.out.println("你的QQ号码为:");
                System.out.println(qq);
                flag = false;//退出条件
            }
        }
    }
}
