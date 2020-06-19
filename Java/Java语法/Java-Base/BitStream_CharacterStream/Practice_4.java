package cn.sherlock.BitStream_CharacterStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Practice_4 {
    /*
    字节输入流一次读取一个字节数据
    描述:利用字节输入流读取D盘文件a.txt的内容，
    文件内容确定都为纯ASCII字符,使用循环读取，一次读取一个字节，
    直到读取到文件末尾。将读取的字节输出到控制台答案
    操作步骤:
    1.	创建字节输入流对象指定文件路径。
    2.	调用read(byte b)方法循环读取文件中的数据
    3.	直到读取到-1时结束读取
    */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        int len = -1;//初始化为-1  定义为-1是一个习惯而已
        while ((len = fis.read())!=-1){//将fis.read()赋值给len
            //fis.read()这个是读出来一个字符的ASCII码  到达文件的最后一个的时候就读成了-1
            System.out.println((char)len);//将这个数字强制转换为(char)字符的形式
        }
    }
}
