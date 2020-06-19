package cn.sherlock.Random_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    /*

     * 统计数字出现次数。

     * 定义getNumList方法，随机生成100个数字，数字范围从1到10。
     * 定义printCount方法，统计每个数字出现的次数并打印到控制台

     */

//    public static void main(String[] args) {
//        ArrayList<Integer> numList = getNumList();
//        printCount(numList);
//
//    }
//
//    private static ArrayList<Integer> getNumList() {
//        ArrayList<Integer> list = new ArrayList<>();
//        Random r = new Random();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("第"+i+"个数字是"+r.nextInt(100));
//            list.add(r.nextInt());
//        }
//        return list;
//    }
//
//    private static void printCount(ArrayList<Integer> list) {
//        //先定义一个计数器的数组
//
//    }
public static void main(String[] args) {

    ArrayList<Integer> numList = getNumList();//将返回的结果传到一个数组里面
    //  统计字符数组中字母出现次数
    printCount(numList);

    }

    public static ArrayList<Integer> getNumList() {//返回值类型为List
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(10) + 1;//产生100个1-10的数字
            list.add(x);//将产生的100个数字加入到List里面
        }
        return list;//返回一个List
    }

    public static void printCount(ArrayList<Integer> list) {
        int[] count = new int[10];
        // 对应保存数字出现的次数
        for (int i = 0; i < list.size(); i++) {
            int c = list.get(i);
            count[c-1]++;
        }
        // 打印数字和次数
        for (int i = 0 ; i < count.length; i++) {
            System.out.println("数字:"+(i+1) + "--" + count[i]+"次");
        }
    }
}
