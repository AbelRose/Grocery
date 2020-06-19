package cn.sherlock.File_Recurrence;

import java.io.File;

/*
将D盘下a.txt文件删除
将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹
 */
public class Practice_5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\a.txt");
        File f2 = new File("D:\\aaa");

        f1.delete();
        f2.delete();

    }



}
