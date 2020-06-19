package cn.sherlock.Random_ArrayList;

import java.util.Random;

public class A {
    public static void main(String[] args) {
        Random r1 = new Random(1);
        int i1 = r1.nextInt(10);
        System.out.println(i1);

        System.out.println("----------");
//        Random r2 = new Random(2);
//        int i2 = r2.nextInt(10);
//        System.out.println(i2);

        Random r2 = new Random(1);//有了这个种子那么产生的随机数就一样了呢
        int i2 = r2.nextInt(10);
        System.out.println(i2);

    }
}
