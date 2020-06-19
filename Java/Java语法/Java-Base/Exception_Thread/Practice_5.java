package cn.sherlock.Exception_Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice_5 {
    /*
    分析代码结果
     */


//    public static void main(String[]args){
//
//        String str=null;
//        System.out.println(str.length());
//    }
//    //调用null方法时 报空指针异常

//    public static void main(String[]args){
//        int arr[]={1,2};
//        System.out.println(arr[2]);
//    }
//    //数组越界异常
//    public static void main(String[]args){
//
//        System.out.println(1/0);
//    }
//    //除零异常
//    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("itcast"));
//    }
//    //将字符串转化为Integer时候 NumberFormatException异常
public static void main(String[] args) {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

    try{
        Date date = format.parse("2019-09-02");
        System.out.println(date);
    }catch (ParseException e){
        System.out.println("异常");
    }
    //程序没有异常 catch代码块不会执行
}



}
