package cn.sherlock.BitStream_CharacterStream;

import java.io.FileOutputStream;
import java.io.IOException;

import static javafx.scene.input.KeyCode.F;

public class Practice_2 {
    /*
    描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
    答案
    操作步骤:
         1.	创建字节输出流FileOutputStream对象并指定文件路径。
         2.	调用字节输出流的write(byte[] buf)方法写出数据。
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\b.txt");
        byte[] bytes = "sherlock holmes".getBytes();
        //创建一个字节数组 存放到bytes里面   注意是取字符串里面的字符 用的方法是getBtes()方法
        fos.write(bytes);//传进来的是bytes 一个数组
        fos.close();

    }
}
