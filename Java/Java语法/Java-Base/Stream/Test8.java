package cn.sherlock.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Test8 {
    /*

    获取并发流
    问题：
    请分别写出获取并发流的两种方式。

     */
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        Stream<String> stream = coll.parallelStream();
//        System.out.println(stream);
        System.out.println("-----");
        Stream<Integer> stream2 = Stream.of(100,200,300).parallel();
//        System.out.println(stream2);
    }
}
