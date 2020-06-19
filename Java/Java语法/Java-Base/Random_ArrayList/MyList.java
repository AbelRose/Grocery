package cn.sherlock.Random_ArrayList;

import java.util.ArrayList;

public class MyList {

    ArrayList<Integer> m1 = new ArrayList<>();

    public void add(Integer num){//需要用Integer类型
        m1.add(num);//增加到列表的尾部
    }

    public void remove(){
        Integer num = m1.get(m1.size()-1);//注意要减掉一
        m1.remove(num);
    }

    public void show(){
        for (int i = 0; i < m1.size(); i++) {
            System.out.print(m1.get(i)+" ");
        }
    }
}
