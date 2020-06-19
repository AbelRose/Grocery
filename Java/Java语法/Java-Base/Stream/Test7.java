package cn.sherlock.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    /*

    组合：concat、结果收集(list)
    问题：
    已知数组arr1中有如下元素{郭靖，杨康}，
    arr2中有如下元素{黄蓉，穆念慈}，
    使用Stream将二者合并到List集合

     */
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("福", "尔");
        Stream<String> stream2 = Stream.of("摩", "斯");

        Stream<String> concat = Stream.concat(stream1, stream2);
        List<String> collect = concat.collect(Collectors.toList());
        System.out.println(collect);
    }
}
