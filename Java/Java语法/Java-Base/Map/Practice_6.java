package cn.sherlock.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice_6 {
    /*
    Map集合的使用（一）
    Q:
    现在有一个map集合如下：
    Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
    要求：
    1.遍历集合，并将序号与对应人名打印。
    2.向该map集合中插入一个编码为5姓名为李晓红的信息
    3.移除该map中的编号为1的信息
	4.将map集合中编号为2的姓名信息修改为"周林"
     */
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }

        System.out.println(map);

        map.put(5,"李晓红");

        System.out.println(map);

        map.remove(1);

        System.out.println(map);

        map.put(2,"周林");

        System.out.println(map);
    }
}
