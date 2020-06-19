package cn.sherlock.Stream;

import java.util.stream.Stream;

public class Test6 {
    /*

    映射：map、逐一消费：forEach
    问题：
    有如下整数1，-2，-3，4，-5
    使用Stream取元素绝对值并打印

     */
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(Math::abs).forEach(System.out::println);
    }
}
