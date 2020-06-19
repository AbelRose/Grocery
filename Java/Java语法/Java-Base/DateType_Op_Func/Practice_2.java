package cn.sherlock.DateType_Op_Func;

import java.text.DecimalFormat;

public class Practice_2 {
    /*

    * 编写步骤：

  1. 定义类 Test2
  2. 定义 main方法
  3. 定义 int类型变量i1 和 long类型变量l1
  4. 定义变量add,保存i1和l1的和,并输出.
  5. 定义 long类型变量l2 和 float类型变量f2
  6. 定义变量add2,保存l2和f2的和,并输出.
  7. 定义 int类型变量i3 和 double类型变量d3
  8. 定义变量add3,保存i3和d3的和,并输出.
  9. 定义 float类型变量f4 和 double类型变量d4
  10. 定义变量add4,保存f4和d4的和,并输出.

     */
    public static void main(String[] args) {
        int i1 = 1;
        long l1 = 2;

        long l = i1 + l1;

//        boolean b = l instanceof Long;
//        System.out.println(b);
        long l2 = 1L;
        float f2 = 2.00F;
        float v = l2 + f2;
//        System.out.println(v);

        float f4 = 1F;
        double d4 = 9.00;
        double v1 = d4 + f4;

        //调用小数点后面几位
        DecimalFormat df = new DecimalFormat(".0000");//想保留几位就保留几位

        System.out.println(df.format(v1));

//        System.out.println(v1);


    }
}
