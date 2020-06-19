package cn.sherlock.Collection;

import java.util.ArrayList;

public class Practice_6 {
    /*
    Collection集合isEmpty()方法的使用
    定义一个方法listTest(ArrayList<String> al),
    要求使用isEmpty()判断al里面是否有元素。
     */
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");

        boolean empty = strings.isEmpty();
        System.out.println(empty);
    }
}
