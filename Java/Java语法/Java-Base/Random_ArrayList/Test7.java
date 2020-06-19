package cn.sherlock.Random_ArrayList;

import java.util.ArrayList;

public class Test7 {
    /*
     * 自定义MyList类，实现存取元素的功能。

     * 定义add方法，可以保存元素，添加MyList尾部。
     * 定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
     * 定义show方法，可以展示MyList中的元素。
     */
    public static void main(String[] args) {

        MyList myList = new MyList();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList.show();

        System.out.println();
        System.out.println("---------");

        myList.remove();
        myList.show();

        System.out.println();
        System.out.println("---------");

    }
}
