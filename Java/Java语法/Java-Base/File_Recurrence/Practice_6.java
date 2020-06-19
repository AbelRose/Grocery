package cn.sherlock.File_Recurrence;

import java.io.File;

/*
获取文件信息:文件名,文件大小,文件的绝对路径,文件的父路径
Q:
获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，
并将信息输出在控制台。

 */
public class Practice_6 {
    public static void main(String[] args) {
        File f = new File("D:\\aaa\\b.txt");
        String name = f.getName();
        long length = f.length();
        String absolutePath = f.getAbsolutePath();
        String parent = f.getParent();//返回的是文件对象
        File parentFile = f.getParentFile();//返回的是字符串对象呢

        System.out.println(name);
        System.out.println(length);
        System.out.println(absolutePath);
        System.out.println(parent);
        System.out.println(parentFile);
    }

}
