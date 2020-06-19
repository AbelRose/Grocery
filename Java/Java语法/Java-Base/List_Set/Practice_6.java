package cn.sherlock.List_Set;

import java.util.HashSet;

public class Practice_6 {
    /*
    HashSet存储自定义类型
    Q:定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，
    姓名和年龄相同的人看做同一人不存储。
     */
    public static void main(String[] args) {
        Person p1 = new Person("a",1);
        Person p2 = new Person("b",2);
        Person p3 = new Person("c",3);
        Person p4 = new Person("d",4);
        HashSet<Person> hs = new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        hs.add(p4);

        System.out.println(hs);//set 是无序不可重复的集合


    }
}
