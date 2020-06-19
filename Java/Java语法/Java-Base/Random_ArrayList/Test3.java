package cn.sherlock.Random_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    /*

     * 集合工具类。
     * 定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
     * 定义replace方法，将某集合中的某元素，全部替换为新元素。

     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int index = findIndex(list, 3);
        System.out.println(index);

        System.out.println("-------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);

        replace(list2,2,0);


    }

    private static int findIndex(List<Integer> list,int num) {

        for (int i = 0; i < list.size(); i++) {
            if(num == list.get(i)){//获取list里面的数据用list.get(i)方法  get方法
                return i;
            }
        }
        return -1;
    }

    private static void replace(List<Integer> list, int num1, int num2) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == num1){
                list.set(i,num2);
            }
        }
        System.out.println(list);
    }

}
