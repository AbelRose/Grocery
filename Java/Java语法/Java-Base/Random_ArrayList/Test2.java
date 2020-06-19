package cn.sherlock.Random_ArrayList;

import cn.sherlock.InternalClass.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    /*

     * 键盘录入学生信息，保存到集合中。
     * 循环录入的方式，1：表示继续录入，0：表示结束录入。
     * 定义学生类，属性为姓名，年龄，使用学生对象保存录入数据。
     * 使用ArrayList集合，保存学生对象，录入结束后，遍历集合。

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        while (true){
            System.out.println("1.录入信息 0.退出");
            int i = sc.nextInt();
            if(i == 0){
               break;
            }else {
                //!!!
                Student stu = new Student();//这个stu对象必须每次都要重新创建一次!!!
                ///!!!
                Scanner sc2 = new Scanner(System.in);
                System.out.println("请输入姓名:");
                String name = sc2.nextLine();
                stu.setName(name);
                Scanner sc3 = new Scanner(System.in);
                System.out.println("请输入年龄:");
                int age = sc3.nextInt();
                stu.setAge(age);
                list.add(stu);

            }
        }

        System.out.println("录入完毕");

        for (Student student : list) {
            System.out.println("学生姓名="+student.getName());
            System.out.println("学生年龄="+student.getAge());
            System.out.println();
        }

//        System.out.println(list);

    }
}
