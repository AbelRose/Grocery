package cn.sherlock.File_Recurrence;

import java.io.File;

/*
文件夹的获取方法
获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件
 */
public class Practice_8 {
    public static void main(String[] args) {
        File f = new File("D:\\aaa");
        File[] files = f.listFiles();

        for (File file : files) {//用增强for循环
            System.out.println(file.getName());
        }
    }
}
