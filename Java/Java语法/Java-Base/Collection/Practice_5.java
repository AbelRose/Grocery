package cn.sherlock.Collection;

import java.util.ArrayList;

public class Practice_5 {
    /*
    Collection集合contains()方法使用
    定义一个方法listTest(ArrayList<String> al,
    String s),要求使用contains()方法判断al集合里面是否包含s。
    */
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("s");


        listTest(strings);
    }

    private static void listTest(ArrayList<String> a) {
        boolean b = a.contains("s");
        System.out.println(b);
    }
}
