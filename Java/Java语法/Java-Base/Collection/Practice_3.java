package cn.sherlock.Collection;

import java.util.ArrayList;

public class Practice_3 {
    /*
    Collection集合数组转集合
    定义一个方法，要求此方法把int数组转成
    存有相同元素的集合(集合里面的元素是Integer)，并返回。()
     */
    public static void main(String[] args) {
        int[] a = {1,2,3};
        ArrayList<Integer> list = int2Array(a);
        System.out.println(list);
    }

    private static ArrayList<Integer> int2Array(int[] a) {

        ArrayList<Integer> list  = new ArrayList<>();

        for (int i : a) {
            list.add(i);
        }

        return list;
    }
}
