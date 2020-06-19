package cn.sherlock.DateType_Op_Func;

public class Practice_6 {
    /*

    - 编写步骤：

 1. 定义类 Test6
 2. 定义 main方法
 3. 定义方法printNum,在main方法中调用printNum方法
 4. printNum方法中,定义int变量a赋值为9,b也赋值为9
 5. printNum方法中,定义int变量num赋值为++a.
 6. printNum方法中,定义boolean变量bo,使用三元运算符赋值,
 当num>=10,赋值为true,否则为false,打印bo的值
 7. printNum方法中,定义int变量num2赋值为b++.
 8. printNum方法中,定义boolean变量bo2,使用三元运算符赋值,
 当num2>=10,赋值为true,否则为false.打印bo2的值


     */
    public static void main(String[] args) {
        printNum();
    }

    private static void printNum() {
        int a = 9, b = 9;
        int num = ++a;
        boolean bo  =  num >= 10 ? true : false;
        System.out.println(bo);

        System.out.println("=================");

        int num2 = b++;
        boolean bo2 = num2 >= 10 ? true : false;
        System.out.println(bo2);
    }
}
