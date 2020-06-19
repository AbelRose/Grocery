package cn.sherlock.Object_API;

public class Practice_4 {
    /*
    StringBuilder类与String类的区别

    Q:简述StringBuilder类与String类的区别。

    A:
    String类的对象内容不可改变，所以每当进行字符串!!拼接!!时，
    总是会在内存中创建一个新的对象，
    所以经常改变内容的字符串最好不要用String，
    因为每次生成对象都会对系统性能产生影响。

    StringBuilder又称为可变字符序列，是JDK5.0中新增加的一个类，
    它是一个类似于String的字符串缓冲区，
    通过某些方法调用可以改变该序列的长度和内容。即它是一个容器，
    容器中可以装很多字符串，并且能够对其中的字符串进行各种操作。
    它的内部拥有一个数组用来存放字符串内容，进行字符串拼接时，
    直接在数组中加入新内容，StringBuilder会!!自动!!维护数组的扩容。

     */
}
