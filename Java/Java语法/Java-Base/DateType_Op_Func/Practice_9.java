package cn.sherlock.DateType_Op_Func;

public class Practice_9 {
    /*

    - 编写步骤：

  1. 定义类 Test9
  2. 定义 main方法
  3. 定义printString方法
  4. printNum方法中,定义String 类型变量str.
  5. printNum方法中,定义int类型变量num,赋为任意整数值.
  6. printNum方法中,通过三元运算符,判断num为偶数,将"偶数"赋值给str,否则将"奇数"赋值给str
  7. printNum方法中,输出拼接效果

     */

    /**
     *
     *
     * 这个例子比较好~~~
     *
     * @param args
     */

    public static void main(String[] args) {
        printString();
    }

    private static void printString() {
        String str = "abc";
        int num = 1;

//        num % 2 == 0 ? (str="偶数") : (str="奇数");
        //(条件表达式) ？ 表达式1:表达式2;
        //   表达式部分不能写语句

        str = (num % 2 == 0) ? "偶数" : "奇数";//可以将表达式的返回值 复制给一个变量

        System.out.println(str);

    }
}
