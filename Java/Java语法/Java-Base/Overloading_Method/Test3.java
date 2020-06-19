package cn.sherlock.Overloading_Method;

import java.util.Scanner;

public class Test3 {
    /*
     * 定义showColor方法，根据英文单词，输出对应的颜色。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        showColor(str);
    }

    public static void showColor(String str){
        switch (str){
            case "red":
                System.out.println(str+" 是红色!");
                break;
            case "blue":
                System.out.println(str+" 是蓝色");
                break;
            case "yellow":
                System.out.println(str+" 是黄色");
                break;
            default:
                System.out.println("请输入三原色");
        }
    }
}
