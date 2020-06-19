package cn.sherlock.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Practice_4 {
    /*
    Map接口中的方法
    Q：往一个Map集合中添加若干元素。获取Map中的所有value，
    并使用增强for和迭代器遍历输出每个value。
     */
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //使用put方法去添加元素
        hm.put("黄晓明", "Baby");
        hm.put("邓超", "孙俪");
        hm.put("李晨", "范冰冰");
        hm.put("大黑牛", "范冰冰");

        //使用value方法获取所有的value
        Collection<String> values = hm.values();
        System.out.println(values);
        System.out.println("----------");
        //用增强for循环来遍历values
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("----------");
        //使用迭代器来遍历values
        Iterator<String> iterator = values.iterator();
        //直接用values.iterator 来进行遍历 也就是集合对象中的方法
        while (iterator.hasNext()){//获取完iterator后 用while循环判断和输出元素
            System.out.println(iterator.next());
        }


    }
}
