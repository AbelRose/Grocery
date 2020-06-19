package cn.sherlock.List_Set;

import java.util.ArrayList;

public class Practice_7 {
    /*
    List集合元素替换
    Q:向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},
    将二丫替换为王小丫。
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
//
//        System.out.println(list);//[张三, 李四, 王五, 二丫, 钱六, 孙七]
//
//        list.remove(3);
//        list.set(3,"xiao");
//        System.out.println(list);//[张三, 李四, 王五, xiao, 孙七]

        //不能这么搞 如果这么搞的话 就把数组的长度给改变了
        //应在在这个list里面找出满足条件的字符串 然后 给替换掉
        for (int i = 0; i < list.size(); i++) {
            //注意这个地方用普通的for循环
            if("二丫".equals(list.get(i))){//这个地方用list.get(i) 获取到list里面的额字符串
                list.set(i,"xiao");
            }
        }
        System.out.println(list);


    }

}
