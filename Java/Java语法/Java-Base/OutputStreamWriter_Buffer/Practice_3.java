package cn.sherlock.OutputStreamWriter_Buffer;

import java.io.*;

public class Practice_3 {
    /*
    高效流文件复制
    描述:利用高效字节输入流和高效字节输出流完成文件的复制。
    要求：
    1.将C盘下的c.png文件复制到D盘下
    2.一次读写一个字节数组方式复制

    答案
    操作步骤:
    1.	创建字节输入流对象并关联文件路径
    2.	利用字节输入流对象创建高效字节输入流对象
    3.	创建字节输出流对象并关联文件路径
    4.	利用字节输出流对象创建高效字节输出流对象
    5.	创建字节数组用来存放读取的字节数
    6.	利用高效字节输入流循环读取文件数据，每读取一个字节数组，利用高效字节输出流对象将字节数组的内容输出到目标文件中。直到读取到文件末尾。
    7.	关闭高效流对象
    */
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Book1.xlsx"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Book1.xlsx"));

        byte[] bytes =new byte[1024];//注意不要忘记new 定义一个接受读取的字节数
        int len  = -1;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();

    }
}
