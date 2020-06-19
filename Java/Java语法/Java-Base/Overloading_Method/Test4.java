package cn.sherlock.Overloading_Method;

public class Test4 {
    /*
    * 定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。


    * 代码实现，效果如图所示：

      ![](img\5.jpg)

    * 开发提示：

      * getValue中，带有String类型参数，可以指定『大』或者『小』
      * 分别定义最大值方法，最小值方法，以供getValue调用。

     */
    public static void main(String[] args) {
        getValue(-1,-2,3,"最小值");
    }

    public static void getValue(int a, int b, int c, String str){
//        a>b ? max=a : max = b;

        /**
         *
         * 三个值的时候如何比较最大值和最小值
         *
         */

        //取最大值
        int max = (a>b ? (a>c ? a : c):(b>c ? b : c));
        //取最小值
        int min = (a<b ? (a<c ? a : c):(b<c ? b : c));

//        if("最大值" == str){
//            System.out.println("最大值为: "+ max);
//        }else("最小值" == str) {
//            System.out.println("最小值为: "+ min);
//        }
        switch (str){

            case "最大值":
                System.out.println("最大值为: "+ max);
                break;
            case "最小值":
                System.out.println("最小值为: "+ min);
                break;

        }
    }
}
