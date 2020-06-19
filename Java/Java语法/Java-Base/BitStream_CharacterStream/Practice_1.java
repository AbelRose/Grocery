package cn.sherlock.BitStream_CharacterStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Practice_1 {
    /*
    描述:利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
    答案
    操作步骤:
        1.	创建字节输出流FileOutputStream对象并指定文件路径。
        2.	调用字节输出流的write(int byte)方法写出数据
    */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");//指定要输出的文件
        fos.write(97);//用write方法写出数据
        fos.close();//用完后 关闭流
    }
}
