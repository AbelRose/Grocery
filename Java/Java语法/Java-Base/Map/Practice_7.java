package cn.sherlock.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice_7 {
    /*
    Q:
    有2个数组，
    第一个数组内容为：
    [黑龙江省,浙江省,江西省,广东省,福建省]，
    第二个数组为：
    [哈尔滨,杭州,南昌,广州,福州]，
    将第一个数组元素作为key，第二个数组元素
    作为value存储到Map集合中。
    如{黑龙江省=哈尔滨,浙江省=杭州, …}。
     */
    public static void main(String[] args) {
       String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
       String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        //用这种方法创建数组 不是ArrayList(这个是集合)
        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            //直接用一个fori就可以了？！！！
            String s1 = arr1[i];
            String s2 = arr2[i];
            hm.put(s1,s2);//可以用数组的形式 将key和value传进去
        }
        System.out.println(hm);
    }
}
