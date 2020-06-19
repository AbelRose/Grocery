package cn.sherlock.DateType_Op_Func;

public class Practice_7 {
    /*

    - 编写步骤：

  1. 定义类 Test7
  2. 定义 main方法
  3. 定义方法printNum,在main方法中调用printNum方法
  4. printNum方法中,定义float变量f1赋值12345.01
  5. printNum方法中,定义float变量f2赋值12345.00
  6. printNum方法中,定义float 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02
  7. printNum方法中,定义float 变量 var2 , 保存var1 与1024的和.
  8. printNum方法中,同时输出var1,var2的值.

     */
    public static void main(String[] args) {
        printNum();
    }

    private static void printNum() {
        float f1 = 12345.01F;
        float f2 = 12345.00F;

        float var1 = f1 >= f2 ? 12456 : (float) 12456.02;
//        float var11 = f1 >= f2 ? 12456 : 12456.02F;//或者在12456.02 后满加上一个F也表示是浮点数
        float var2 = var1 + 1024;

        System.out.println(var1);
        System.out.println("=============");
        System.out.println(var2);

    }
}
