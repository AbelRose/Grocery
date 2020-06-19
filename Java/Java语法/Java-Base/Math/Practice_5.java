package cn.sherlock.Math;

import java.util.Random;

public class Practice_5 {
    /*
    ## 第五题：需求实现

    * 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
    * 代码实现，效果如图所示：
      ![](img\5.jpg)
     */

    public static void main(String[] args) {
        double random = Math.random()*100;//获取到的是[0,100)之间的随机数
        String r = random + "";//将其他类型转变为字符串类型
        System.out.println("这个随机数为: "+r);
        String[] split = r.split("\\.");
        //这个 . 必须需要进行转义 用\\
        //sum: | * ^ : . 这几个必须用\\进行转义

//        System.out.println(split.length);
        String pro = split[0];
        String bef = split[1].substring(0,2);//substring 这个方法是将字符串从哪截取到哪
        //subString这个方法也是包括左边 不包括右边

//        System.out.println(split[0]);
//        System.out.println(split[1].substring(0,2));
        boolean b = r instanceof String;//判断是否是String类型 返回一个boolean类型
        System.out.println("是否是字符串？"+b);
        System.out.println("转换的结果为: "+pro+"."+bef);
    }
}
