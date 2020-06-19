package cn.sherlock.BitStream_CharacterStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Practice_5 {
    /*
    字节输入流一次读取一个字节数组数据
    描述:利用字节输入流读取D盘文件b.txt的内容，
    文件内容确定都为纯ASCII字符,使用循环读取，一次读取一个字节数组，
    直到读取到文件末尾，将读取到的字节数组转换成字符串输出到
    控制台。

    答案
    操作步骤:
    1.创建字节输入流对象指定文件路径。
    2.定义一个字节数数组，用来存放读取的字节数
    3.调用read(byte[] buf)方法传入字节数组，循环读取文件中的数据
    4.直到读取到-1时结束读取
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\b.txt");
        byte[] buf = new byte[1024];
        int len = -1;
        while ((len=fis.read(buf))!=-1){//注意 在read()的括号里要写bytes
            //下面是错误的写法
//            System.out.println(fis.read(bytes));
            System.out.print(new String(buf,0,len));
            //直接new 一个字符串 然后把buf这个字符数组 传进到第一个参数 然后第二个和第三个 参数是偏移量 offset 0到len
        }
        fis.close();
    }
}
