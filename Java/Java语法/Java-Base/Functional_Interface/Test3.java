package cn.sherlock.Functional_Interface;

public class Test3 {
    /*

    静态方法引用
    1.	定义一个函数式接口NumberToString,
        其中抽象方法String convert(int num)，
        使用注解@FunctionalInterface

    2.	在测试类中定义static void decToHex(int num ,NumberToString nts),
        该方法的预期行为是使用nts将一个十进制整数
        转换成十六进制表示的字符串，

        tips:已知该行为与Integer类中的toHexString方法一致

    3.	测试decToHex (),使用方法引用完成需求

     */
    public static void main(String[] args) {
        decToHex(17,Integer :: toHexString );
        //这个是lambda表达式的一种形式
        //类名::方法名  注意这个方法名后面是不带括号的呢
        //第一个代表传进来的参数, 第二个Integer :: toHexString 表示重写convert方法
    }

    public static void decToHex(int num, NumberToString ntd){
        String convert = ntd.convert(num);
        System.out.println(convert);
    }
}
