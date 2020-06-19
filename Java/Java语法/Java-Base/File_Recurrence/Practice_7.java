package cn.sherlock.File_Recurrence;

import java.io.File;

/*
文件夹或文件的判断
Q:
描述:
1.判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)

 */
public class Practice_7 {
    public static void main(String[] args) {
        File f1 = new File("D:\\aaa");
        File f2 = new File("D:\\a.txt");

        if(f1.isDirectory()){
            System.out.println("是文件夹");
        }else{
            System.out.println("不是文件夹");
        }

        if(f2.isFile()){
            System.out.println("是文件");
        }else {
            System.out.println("不是文件");
        }
    }
}
