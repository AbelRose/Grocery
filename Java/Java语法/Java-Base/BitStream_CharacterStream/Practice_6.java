package cn.sherlock.BitStream_CharacterStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice_6 {
    /*
    字节流复制文件
    描述:利用字节流将D盘下的test.png图片复制到盘下
    (文件名保存一致)
    要求：
    一次读写一个字节的方式C
    答案
    操作步骤:
    1.创建字节输入流对象关联文件路径：D下的test.png
    2.创建字节输出流对象关联文件路径：C下的test.png
    3.使用循环不断从字节输入流读取一个字节，每读取一个字节就利用输出流写出一个字节。
    4.关闭流，释放资源
    */


//    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("D:\\1.jpg");
//        FileOutputStream fos = new FileOutputStream("D:\\aaa\\1.jpg");//不知为何不能向c盘里面输出流
//
//        int len = -1;
//        while ((len = fis.read())!=-1){
//            fos.write(len);
//        }
//        fis.close();//先不读出数据了 之后再关闭输出流
//        fos.close();
//
//    }
    //用字符数组的方式 效率会更高哦~~
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\aaa\\1.jpg");

        int len = -1;

        byte[] buf = new byte[1024];

        while ((len = fis.read(buf)) != -1){
            fos.write(buf);
        }

        fis.close();
        fos.close();

    }



}
