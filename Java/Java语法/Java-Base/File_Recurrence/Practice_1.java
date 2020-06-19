package cn.sherlock.File_Recurrence;

import java.io.File;
import java.io.IOException;


/*
相对路径和绝对路径的使用
Q:创建两个文件对象，分别使用相对路径和绝对路径创建

 */
public class Practice_1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\a.txt");
        //注意 在这个地方创建的只是一个文件对象！而已！
        File f2 = new File("a.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
