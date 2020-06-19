package cn.sherlock.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test5 {
    /*

    取用前几个：limit、跳过前几个：skip
    问题：
    已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，
    使用Stream
    1、取出前2个元素并在控制台打印输出。
    2、取出后2个元素并在控制台打印输出

     */

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("陈玄风");
//        list.add("梅超风");
//        list.add("陆乘风");
//        list.add("曲灵风");
//        list.add("武眠风");
//        list.add("冯默风");
//        list.add("罗玉风");
//
//        list.stream().limit(2).forEach(System.out::println);
//        System.out.println("--------");
//        list.stream().skip(list.size()-2).forEach(System.out::println);



        Stream<String> stream = Stream.of("陈玄风", "梅超风", "陆乘风", "曲灵风", "武眠风", "冯默风", "罗玉风");

//        stream.limit(2).forEach(System.out::println);

        System.out.println("-------");

        stream.skip(7-2).forEach(System.out::println);

        /**
         * 如果预先定义数组 而直接使用 stream.of() 方法的话 那么：
         * 1.无法得到数组的长度 list.size()
         * 2.无法多次使用
         */
    }
}
