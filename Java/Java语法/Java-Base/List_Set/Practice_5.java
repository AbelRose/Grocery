package cn.sherlock.List_Set;

import java.util.LinkedList;

public class Practice_5 {
    /*
    LinkedList方法的使用
    根据要求练习LinkedList方法：
    （1）基本方法：add, set, get, remove, clear, size等方法；
    （2）特有方法：addFirst, addLast, getFirst, getLast,
     removeFirst, removeLast, push, pop, clear等方法。
     */
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("a");
        ll.add('a');
        int[] a = {1,2,3};
        ll.add(a[0]);
        System.out.println(ll);

        ll.set(0,2);

        System.out.println(ll);

        System.out.println(ll.get(3));

        ll.remove(1);

        System.out.println(ll);

        ll.clear();
        System.out.println(ll);

        ll.add(1);
        int size = ll.size();
        System.out.println(size);

        ll.addFirst("aaa");
        System.out.println(ll);

        ll.addLast("bbb");
        System.out.println(ll);

        ll.push(100);
        System.out.println(ll);

        ll.pop();
        System.out.println(ll);



    }
}
