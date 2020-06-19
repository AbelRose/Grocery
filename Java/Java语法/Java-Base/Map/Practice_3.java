package cn.sherlock.Map;

import java.util.HashMap;

public class Practice_3 {
    /*
    Map接口中的常用方法
    Q:请使用Map集合的方法完成添加元素，根据键删除，
    以及根据键获取值操作
     */
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //使用put方法去添加元素
        hm.put("黄晓明", "Baby");
        hm.put("邓超", "孙俪");
        hm.put("李晨", "范冰冰");
        hm.put("大黑牛", "范冰冰");

        //使用put方法修改元素
        String v1 = hm.put("大黑牛", "aaa");
//        System.out.println(v1);范冰冰 是value

        //使用get方法去获取元素
        String string = hm.get("大黑牛");

//        System.out.println(string);aaa 是value
        System.out.println(hm);

        //使用remove方法删除
        String v2 = hm.remove("大黑牛");
//        System.out.println(hm);aaa 是value
//        System.out.println(v2);
        System.out.println(hm);
    }
}
