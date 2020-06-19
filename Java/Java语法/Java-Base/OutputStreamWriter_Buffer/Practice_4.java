package cn.sherlock.OutputStreamWriter_Buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * BvufferedOutStream 和 BufferedWriter 的区别？
 *
 * 字节缓冲流
 * 1.缓冲字节输入流 BufferedInputStream
 * 2.缓冲字节输出流 BufferedOutStream
 *
 * 字符缓冲流
 * 1.字符缓冲输入流 BufferedReader
 * 2.自负缓冲输出流 BufferedWriter
 *
 */
public class Practice_4 {
    /*
    高效字符流和集合的综合使用

    描述:
    分析以下需求，并用代码实现
	实现一个验证码小程序，要求如下：
	1. 在项目根目录下新建一个文件：data.txt,
	键盘录入3个字符串验证码，并存入data.txt中，
	要求一个验证码占一行；
	2. 键盘录入一个需要被校验的验证码，
	如果输入的验证码在data.txt中存在：在控制台提示验证成功，
	如果不存在控制台提示验证失败

     */
    public static void main(String[] args) throws Exception {
        //总共有两个功能那么就写两个方法
        writeString2File();
        verifyCode();
    }

    private static void writeString2File() throws IOException {
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("data.txt"));
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//
//        for (int i = 0; i < 3; i++) {
//            bos.write();
//        }
        //貌似不能用 BufferedOutputStream 应该用BufferedWriter 呢
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        Scanner sc =new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();//注意这条语句要定义在这个for循环里面 每次输入都需要一个sc.nextLine()
            bw.write(line);
            bw.newLine();//这条语句是调用系统的换行符 每次输入结束(按Enter后都会自动换一行)
        }
        bw.close();//关闭流文件

    }

    //此功能比较复杂
    private static void verifyCode() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        ArrayList<String> list = new ArrayList<>();//搞一个列表接收之前输入的验证码信息
        String line = null;
        while ((line = br.readLine())!=null){
            list.add(line);//将所有的行都读到这个数组列表中去
        }
        br.close();
        Scanner sc =new Scanner(System.in);
        String yzm = sc.nextLine();
        if(list.contains(yzm)){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }

    }
}
