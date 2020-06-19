package cn.sherlock.List_Set;

public class Practice_4 {
    /*

    Comparable和Comparator比较器
    简述Comparable和Comparator两个接口的区别。

    Comparable：强行对实现它的每个类的对象进行整体排序。
    这种排序被称为类的自然排序，类的compareTo方法被称为它的
    自然比较方法。只能在类中实现compareTo()一次，
    不能经常修改类的代码实现自己想要的排序。实现此接口的对象列表
    （和数组）可以通过Collections.sort（和Arrays.sort）
    进行自动排序，对象可以用作有序映射中的键或有序集合中的元素，
    无需指定比较器。

    Comparator强行对某个对象进行整体排序。可以将Comparator
     传递给sort方法（如Collections.sort或 Arrays.sort），
     从而允许在排序顺序上实现精确控制。还可以使用Comparator来控制
     某些数据结构（如有序set或有序映射）的顺序，或者为那些
     没有自然顺序的对象collection提供排序。
     */
}
