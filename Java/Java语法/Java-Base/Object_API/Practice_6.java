package cn.sherlock.Object_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice_6 {
    /*
    DateFormat类方法的使用
    Q:使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日
    */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse("2012-12-12");//用parse方法传入 制定的时间 注意不是format方法
        //这个parse是用来传参数的

        String format = sdf.format(date);

        System.out.println(format);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        //这个sdf用来指定输出的格式

        String format1 = sdf2.format(date);//调用foramt方法指定格式
        System.out.println(format1);
    }
}
