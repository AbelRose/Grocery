package cn.sherlock.Collection;

import java.util.ArrayList;

public class Practice_8 {
    /*
    Collection集合返回首次出现索引
    定义一个方法listTest(ArrayList<Integer> al, Integer s)，
    要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int i = 0;
        listTest(list,1);
    }

    private static void listTest(ArrayList<Integer> list,Integer i) {
        for (Integer integer : list) {
            if(integer.equals(i)){
                int loc = list.indexOf(i);
                System.out.println(loc);
            }
        }
    }
}
