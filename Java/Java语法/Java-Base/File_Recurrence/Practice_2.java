package cn.sherlock.File_Recurrence;

import java.io.File;
import java.io.IOException;

/*
检查文件是否存在,文件的创建
Q:检查D盘下是否存在文件a.txt,如果不存在则创建该文件
 */
public class Practice_2 {
    public static void main(String[] args) {
        File f = new File("D:\\MaTrix\\a.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file = new File("b.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
