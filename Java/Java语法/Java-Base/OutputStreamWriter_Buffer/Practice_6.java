package cn.sherlock.OutputStreamWriter_Buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice_6 {
    /*
    转换输入流的使用

    描述:利用转换输入流将当前项目根目录下
    使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
    要求：不能出现乱码的情况。

    答案
    操作步骤:
    1.	创建字节输入流对象指定文件路径。
    2.	根据字节输入流对象创建转换输入流对象
        并指定字符集编码为：gbk
    3.	调用转换输入流对象的读取方法读取内容
    4.	关闭流释放资源

     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader isr = new InputStreamReader(fis, "gbk");
        //创建转换输入流对象
        int len = -1;
        char[] buf = new char[1024];//注意这个地方是char 字符类型的
        while ((len = isr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));//new String 直接将 这个字符数组转变成一个字符串 并且制定长度offset
        }
        isr.close();
    }
}
