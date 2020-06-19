package cn.sherlock.File_Recurrence;

import java.io.File;

/*
在D盘下创建一个名为ccc的文件夹，要求如下：
1.ccc文件夹中要求包含bbb子文件夹
2.bbb子文件夹要求包含aaa文件夹
 */
public class Practice_4 {
    public static void main(String[] args) {
        File f = new File("D:\\qqq\\www\\eee");
        f.mkdirs();//多一个s
        if(f.exists()){
            System.out.println("OK");
        }
    }
}
