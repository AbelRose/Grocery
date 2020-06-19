package cn.sherlock.Stream;

import java.util.*;
import java.util.stream.Stream;

public class Test3 {
    /*

    如何获取流
    问题：
    简述单列集合、双列集合、数组分别如何获取Stream流对象，
    并进行演示

     */
    public static void main(String[] args) {
        /**
         *
         *1、java.util.Collection接口中加入了default方法stream()获取流对象，因此其所有实现类均可通过此方式获取流。
         *2、java.util.Map接口想要获取流，先通过keySet()、values()或entrySet()方法获取键、值或键值对的单列集合，再通过stream()获取流对象。
         *3、数组获取流，使用Stream接口中的的静态方法of(T...values)获取流。
         *
         */
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valueStream = map.values().stream();
        Stream<Map.Entry<String,String>>entryStream = map.entrySet().stream();

        String[] array = {"东邪","西毒"};
        Stream<String> stream = Stream.of(array);

    }
}
