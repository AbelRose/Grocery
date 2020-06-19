package cn.sherlock.BitStream_CharacterStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Practice_3 {
    /*
    文件的续写和换行输出
    描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
    在c.txt文件原内容基础上，添加五句 I love java，
    而且要实现一句一行操作(注：原文不可覆盖)。
    利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”

    答案
    操作步骤:
    1.	利用两个参数的构造方法创建字节输出流对象，
    参数一指定文件路径，参数二指定为true
    2.	调用字节输出流的write()方法写入数据，
    在每一行后面加上换行符:”\r\n”.
*/

	public static void main(String[] args) throws IOException{
		// 1.创建字节输出流FileOutputStream对象并指定文件路径,并追加方式
		FileOutputStream fos = new FileOutputStream("D:\\c.txt",true);
		// 2.调用字节输出流的write方法写出数据
		// 2.1 要输出的字符串
		String content = "i love java \r\n";//这个地方定义的是一个字符串
		for (int i = 0; i< 5; i++) {
			fos.write(content.getBytes());
		}
		// 3.关闭流
		fos.close();
	}
}

//    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("D:\\c.txt",true);//设置第二个参数为true 说明可以以追加的形式添加文本
//        byte[] b1 ="\rwrite\r\n".getBytes();//\r是回车 \n是换行 只有\r\n才能达到回车换行
//        byte[] b2 ="write\r\n".getBytes();
//        for (int i = 0; i < 3; i++) {
//            if(i == 0){
//                fos.write(b1);
//            }else {
//                fos.write(b2);
//            }
//        }
//        fos.close();
//
//    }

