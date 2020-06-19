package cn.sherlock.Overloading_Method;

public class Test6 {
    /*
    * 定义round方法，接收一位小数，实现四舍五入运算，并返回结果。

    * 代码实现，效果如图所示：

      ![](img\7.jpg)

    * 开发提示：

      * round方法中，参数+0.5后，转换为int类型，并返回。
     */
    public static void main(String[] args) {
        round(10.4);
    }

    private static void round(Double num) {
//        String s = num.toString();
//        String[] split = s.split(".");
//        if (split[1] >= )

        //好巧妙的解法
        int res = (int) (num+0.5);//强制转变为int类型 只取整数部分 不要小数部分
        System.out.println(res);

    }
}
