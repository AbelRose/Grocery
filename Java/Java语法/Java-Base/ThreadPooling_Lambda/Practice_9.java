package cn.sherlock.ThreadPooling_Lambda;

public class Practice_9 {
    public static void main(String[] args) {
// 1.在此使用Lambda【标准格式】调用invokeCalc方法来计算130-120的结果ß
        invokeCalc(130, 120, (int a, int b) -> {
            return a - b;
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
