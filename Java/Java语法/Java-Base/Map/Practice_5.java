package cn.sherlock.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice_5 {
    /*
    HashMap存储键是自定义对象值是String
    Q:请使用Map集合存储自定义数据类型Car做键，
    对应的价格做值。并使用keySet和entrySet两种方式
    遍历Map集合。
     */
    public static void main(String[] args) {
        HashMap<Car, Integer> hm = new HashMap<>();

        Car c1 = new Car("布加迪", "黄色");
        Car c2 = new Car("兰博基尼", "白色");
        Car c3 = new Car("野马", "黑色");
        //其实这些c1 c2 c3 就是key

        hm.put(c1,100);//输入键值对
        hm.put(c2,200);
        hm.put(c3,300);

        System.out.println(hm);

        System.out.println("----------------");

        //使用keySet方法获取
        Set<Car> cars = hm.keySet();//获得所有的键
        for (Car car : cars) {//这个car 任然是一个 Car类
//            System.out.println(car);//获取的是key
//            System.out.println("--------------");
            Integer integer = hm.get(car);//get方法得到的是value
            System.out.println(car.getName()+" "+car.getColor()+" "+integer);
        }
        System.out.println("------------------");

        //利用entrySet方法获取 Enttry项
        Set<Map.Entry<Car, Integer>> entries = hm.entrySet();
        for (Map.Entry<Car, Integer> entry : entries) {
//            System.out.println(entry);//是一个键值对
            Car key = entry.getKey();//这个key 任然是一个Car类
            Integer value = entry.getValue();
//            System.out.println(value);
            System.out.println(key.getName()+" "+key.getColor()+ " "+value);
        }
    }
}