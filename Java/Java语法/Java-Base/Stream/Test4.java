package cn.sherlock.Stream;

import java.util.stream.Stream;

public class Test4 {
    /*
    !!!!!
    有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
    使用Stream将以郭字开头的元素存入新数组
    ("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏")
     */
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        String[] guo = stream.filter(s -> s.startsWith("郭")).toArray(String[]::new);//-> 后面地方法体不用加括号  String[]::new 表示创建一个新的数组
        System.out.println(guo[1]);
    }
}
