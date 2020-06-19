package cn.sherlock.BitStream_CharacterStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice_7 {
    /*
    字符输出流写出字符数据
    项目需求：请用户从控制台输入信息，
    程序将信息存储到文件Info.txt中。
    可以输入多条信息，每条信息存储一行。
    当用户输入：”886”时，程序结束。

    答案
    操作步骤:
    1.	创建MainAPP类,并包含main()方法
    2.	按照上述要求实现程序
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Info.txt");//如果是从控制台接受到数据 用这个FileWriter类接受

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        while (true){//有条件结束的时候 可以写一个死循环
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }else {
                fw.write(str);//主要是这个地方用到了FileWRiter
                fw.write(System.lineSeparator());//写入空格分隔符
            }
        }
        fw.close();//这个流关闭的位置一定要确认好 要不然就可能写不进去
    }
}
