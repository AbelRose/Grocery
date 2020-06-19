package cn.sherlock.Object_API;

import java.util.Calendar;

public class Practice_7 {
    /*
    Calendar类方法的使用
    Q:用程序判断2018年2月14日是星期几
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //用getInstance方法创建一个Calendar对象
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,14);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);

        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(year+"年"+month+"”+date+week);
    }
    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
/*获取你设置的myCal那年那月那日是星期几，必须要减一，
因为数组下标从0开始，而她返回的是数组的内容，是数组{1,2,3,4,5,6,7}中用1~7来表示：星期天，星期一，星期二，星期三，星期四，星期五，星期六 。
如果当天是星期一她会返回2，所以减一，才等于1，才是你想要的，如果是星期天就返回1-1=0咯！

所以，myCal.get(Calendar.DAY_OF_WEEK)-1返回星期几分别是：
星期天，星期一，星期二，星期三，星期四，星期五，星期六 
*/
