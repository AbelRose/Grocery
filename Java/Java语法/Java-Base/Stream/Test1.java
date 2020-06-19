package cn.sherlock.Stream;

import java.util.function.Predicate;

public class Test1 {
    /*
    ！！！！！
    Predicate接口使用
    1.	请在测试类main方法中完成以下需求
    已知有Integer[] arr = {-12345, 9999,
    520, 0,-38,-7758520,941213}
    a)	使用lambda表达式创建Predicate对象p1,
    p1能判断整数是否是自然数(大于等于0)
    b)	使用lambda表达式创建Predicate对象p2,
    p2能判断整数的绝对值是否大于100
    c)	使用lambda表达式创建Predicate对象p3,
    p3能判断整数是否是偶数

    遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，
    完成以下需求
    i.	打印自然数的个数
    ii.	打印负整数的个数
    iii.打印绝对值大于100的偶数的个数
    iv.	打印是负整数或偶数的数的个数

     */
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213};
//        a)	使用lambda表达式创建Predicate对象p1,
//        Predicate<Integer> p1 = (p1) -> p1>=0;注意这个地方的变量名不能 再命名为p1 应该换一个
        Predicate<Integer> p1 = (pre) -> pre >= 0;

//        b)	使用lambda表达式创建Predicate对象p2,
        Predicate<Integer> p2 = (pre) -> Math.abs(pre) > 100; //(pre) 这个地方的括号不能丢了 在Math.abs()里面穿进去 pre 参数  后面还要加上条件

//        c)	使用lambda表达式创建Predicate对象p3,p3
        Predicate<Integer> p3 = (pre) -> pre % 2 == 0;//若%2后是0 那么就是偶数s

        //如果想要是使用 Predicate 就要用 .test()方法
        /*for (int i = 0; i < arr.length; i++) {
            p1.test(arr[i]);  注意test里面必须传进去Integer类型
        }
        */

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (Integer integer : arr) {
            if (p1.test(integer)) {
                count1++;
            }

            if (p1.negate().test(integer)) {//negate()方法 是取该数的负数
                count2++;
            }

            if (p2.test(integer) && p3.test(integer)) {
                count3++;
            }

            if (p1.negate().test(integer) || p3.test(integer)) {
                count4++;
            }
        }

        System.out.println("自然数的个数"+count1);
        System.out.println("负整数的个数"+count2);
        System.out.println("绝对值大于100的偶数的个数"+count3);
        System.out.println("负整数或偶数的数的个数"+count4);//0是偶数
    }
}
