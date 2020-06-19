package cn.sherlock.BitStream_CharacterStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Practice_8 {
    /*

    IO对象Properties结合使用,设置properties文件
    我有一个文本文件score.txt，我知道数据是键值对形式的，
    但是不知道内容是什么。
    请写一个程序判断是否有"lisi"这样的键存在，
    如果有就改变其实为"100"
    score.txt文件内容如下：
    zhangsan = 90
    lisi = 80
    wangwu = 85

    答案
    操作步骤:
    1.	创建一个空的Properties集合
    2.	读取数据到集合中
    3.	遍历集合，获取到每一个key
    4.	判断当前的key 是否为 "lisi"，
    如果是就把"lisi"的值设置为100
    5.	把集合中所有的信息，重新存储到文件中

    提示信息：
    把集合中的信息，存储到文件中，可以用如下方法。
    java.util 类 Properties
    void store(OutputStream out, String comments)
    以适合使用load(InputStream)方法加载到
    Properties表中的格式，将此Properties表中的属性列表
    （键和元素对）写入输出流。

    参数：
    out - 输出流。
    comments - 属性列表的描述。

     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("score.txt");
        FileOutputStream fos = new FileOutputStream("D:\\sun.txt");

        Properties properties = new Properties();
        properties.load(fis);

        Set<String> keys = properties.stringPropertyNames();

        for (String key : keys) {
            if(key.equals("lisi")){
                properties.setProperty(key,"100");
            }
        }
        properties.store(fos,"aaa");



    }



}
