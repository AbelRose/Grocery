package cn.sherlock.Math;

import java.util.Scanner;

public class Practice_3 {
    /*
    ## 第三题：需求实现

    * 字符串查找。
      * 键盘录入一个大字符串，再录入一个小字符串。
      * 统计小字符串在大字符串中出现的次数。


    * 代码实现，效果如图所示：
      ![](img\3.jpg)
     */
    public static void main(String[] args) {
        Scanner big = new Scanner(System.in);
        Scanner small = new Scanner(System.in);

        System.out.println("请输入大的字符串：");
        String s1 = big.nextLine();
        System.out.println("请输入小的字符串：");
        String s2 = small.nextLine();

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

//        boolean b = s1.contains(s2);
//
//        System.out.println(b);

        //以下是原答案
        int index = 0;
        int count = 0;
        while ((index = s1.indexOf(s2, index))!=-1){
            //这个方法就代表s2在s1里面出现的位置 找不到的时候返回-1
            count++;
            index++;//index的基数是 small的字符串的长度 比如是2 那么就是2+2
        }
        System.out.println(count);
    }
}
