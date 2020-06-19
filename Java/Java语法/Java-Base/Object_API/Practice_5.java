package cn.sherlock.Object_API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice_5 {
    /*
    Date类的使用
    Q:请用代码实现:获取当前的日期,并把这个日期转换为
    指定格式的字符串, 如2088-08-08 08:08:08。
    A:
        1)先创建一个Date 表示现在的时间
        2)创建SimpleDateFormat对象 指定格式
        3)用sdf的format方法 并把date传进去
        4)打印输出
    */
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //日期格式函数

        String time = sdf.format(date);
        //把date给format格式化

        System.out.println(time);

    }
}
