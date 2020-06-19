package cn.sherlock.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Practice_2 {
    /*
    Collection集合统计元素出现次数
    Q:
    给定以下代码，请定义方法listTest()统计集合中指定元素
    出现的次数，如"a": 2,"b": 2,"c" :1, "xxx":0。
	Collection<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		System.out.println("a:"+listTest(list, "a"));
		System.out.println("b:"+listTest(list, "b"));
		System.out.println("c:"+listTest(list, "c"));
		System.out.println("xxx:"+listTest(list, "xxx"));
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }
    public static int listTest(ArrayList<String> list ,String str){
        //这个返回值是int类型的 传进来两个参数
        int count = 0;
        for (String s : list) {
            if(s.equals(str)){//注意这个地方是str变量 不是"str"字符串
                count++;
            }
        }
        return count;

//        int count = 0;
//        boolean b = list.contains(str);
//        //只能判断是否包含 不能判断个数 所以害得用循环
//        System.out.println(b);
//        if(list.contains(str)){
//            count++;
//        }
//        return count;



    }
}
