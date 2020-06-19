package cn.sherlock.File_Recurrence;

import java.io.File;

/*
在D盘下创建一个名为bbb的文件夹
 */
public class Practice_3 {
    public static void main(String[] args) {
        File f = new File("D:\\abb");
        f.mkdir();//创建单级文件夹
        if(f.exists()){
            System.out.println("ok");
        }
    }

}
