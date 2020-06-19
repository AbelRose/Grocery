package cn.sherlock.OutputStreamWriter_Buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice_1 {
    /*
    高效字节输出流写出字节数据
    描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
    答案
    操作步骤:
    1.	创建字节输出流对象关联文件路径
    2.	利用字节输出流对象创建高效字节输出流对象
    3.	调用高效字节输出流对象的write方法写出一个字节
    4.	关闭高效流，释放资源。
    */
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\1.txt"));
        bos.write(97);
        bos.close();
    }
}
