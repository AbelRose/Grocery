package cn.sherlock.Math;

import java.util.Scanner;

public class Practice_4 {
    /*
    ## 第四题：需求实现

    * 替换某字符串中的某字符串。
      * 键盘录入一个srcStr字符串，再录入一个delStr字符串。
      * 删除该字srcStr符串中的所有delStr字符串。
    * 代码实现，部分效果如图所示：
      ![](img\4.jpg)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入源字符:");
        String srcStr = sc.nextLine();
        System.out.println("请输入需要删除的字符:");
        String delStr = sc.nextLine();

        //用replace方法 第一个参数是要删除的字符串 第二个参数设置为"" 就表示 删除
        //用replace接收结果
        String replace = srcStr.replace(delStr, "");
        //这个replace方法是真的强大~~
        System.out.println("删除后的结果是:");
        System.out.println(replace);

        int i = (srcStr.length() - replace.length()) / delStr.length();
        System.out.println("删除的个数为:");
        System.out.println(i);
    }
}
