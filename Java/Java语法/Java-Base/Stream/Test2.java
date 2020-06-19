package cn.sherlock.Stream;

import java.util.*;
import java.util.function.Function;

public class Test2 {
    /*

    Function接口使用
    1.	使用lambda表达式分别将以下功能封装到Function对象中
    a)	求Integer类型ArrayList中所有元素的平均数
    b)	将Map<String,Integer>中value存到ArrayList<Integer>中
    2.	已知学生成绩如下
    姓名	成绩
    岑小村	59
    谷天洛	82
    渣渣辉	98
    蓝小月	65
    皮几万	70
    3.	以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩

     */
    public static void main(String[] args) {

//        a)求Integer类型ArrayList中所有元素的平均数
        Function<ArrayList<Integer>,Integer> f1 = (list) -> {//这个list是第一个参数的 第二个是要返回的
            Integer sum = 0;
            for (Integer i : list) {
                sum+=i;
            }
            return sum/list.size();
        };

//        b)将Map<String,Integer>中value存到ArrayList<Integer>中
        Function<Map<String,Integer>, ArrayList<Integer>> f2 = (map) -> {
//            ArrayList<Integer> list = new ArrayList<>();
//
//            for (String key : map.keySet()) {
//                Integer integer = map.get(key);
//                list.add(integer);
//            }
//
//            return list;

            Collection<Integer> value = map.values();
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(value);
            return list;
        };

        Map<String, Integer> map = new HashMap<>();

        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);

//        ArrayList<Integer> apply = f2.apply(map);
//        Integer apply1 = f1.apply(apply);
//        System.out.println(apply1);

        Integer integer = f2.andThen(f1).apply(map);//这个顺序也有讲究的
        //先用f2函数 作用然后返回一个list 集合 将这个传到f1里面进行计算平均数
        System.out.println(integer);

    }
}
