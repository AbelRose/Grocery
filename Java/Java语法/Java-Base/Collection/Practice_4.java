package cn.sherlock.Collection;

import java.util.ArrayList;

public class Practice_4 {
    /*
    Collection集合集合转数组
    定义一个集合，并把集合(集合里面的元素是Integer)
    转成存有相同元素的数组，并将结果输出在控制台。
    （可以使用Object[]数组类型接收转换的数组）
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

//        Object[] objects = list2Array(list);
        //直接就有list.toArray();的方法
        Object[] objects = list.toArray();

        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]+" ");
        }
    }

//    private static Object[] list2Array(ArrayList<Integer> list) {
//
//        int[] arr = new int[];
//        int size = list.size();
//        for(int i = 0;i < size ;i++){
//            arr[i];
//        }
//
//
//    }
}
