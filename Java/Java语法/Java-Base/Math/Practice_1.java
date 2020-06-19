package cn.sherlock.Math;

import java.util.Scanner;

public class Practice_1 {
    /*
    ## 第一题：需求实现

    * 反转键盘录入的字符串。

    * 代码实现，效果如图所示：

      ![](img\1.jpg)

    * 开发提示：

      * 使用字符数组保存原始字符，利用Random类生成随机索引。
     */
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();//放到一个数组里面
//        System.out.println(chars[0]);
        System.out.println("字符串倒转后:");
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }

        /**
         *
         * 还可以直接存放到一个字符串数组里面 然后打印输出
         *
         * String str;//作为一个参数
         * String s = ""//用于接收 反转后的字符串
         * char[] c = str.toCharArray();
         * for(int i = c.length()-1; i>=0; i++){
         *     s += c[i];//将反转字符存到字符串里面
         * }
         *
         * return s;
         *
         */

    }
}
