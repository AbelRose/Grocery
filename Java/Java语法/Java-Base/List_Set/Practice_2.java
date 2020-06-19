package cn.sherlock.List_Set;

import java.util.HashSet;

public class Practice_2 {

    /*
    hashCode和equals方法
    Q:请简述HashSet去除重复元素的原理
    	调用被添加元素的hashCode()，
        和HashSet中已有元素的hashCode比较是否相同
    	如果不相同，直接存储
    	如果相同，调用equals方法比较是否相同
    	不相同，直接存储元素
    	相同，认为是同一元素.不存储
    */
    public  static void main(String[] args) {
        HashSet<Integer> set =  new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);//这个hashCode()是自动判断的呢 重复的话就不存储了 自动调用方法

        HashSet<Integer> integers = new HashSet<>();

        System.out.println(set);

    }

}
