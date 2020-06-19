package cn.sherlock.InternalClass;

import java.util.ArrayList;

public class Practice_2 {
    /*

- 定义学生类：

  - 属性：姓名，出勤。
  - 提供基本的构造方法和get方法，set方法。

- 定义讲师类：

  - 属性：姓名。
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：点名方法，设置每一位的学生出勤情况。
    假设，小明今日未出勤。

- 定义课程类：

  - 属性：课程名称，讲师，学生集合。
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：show方法，打印课程信息，老师姓名，学生是否上课情况。

     */
    public static void main(String[] args) {
        Student s = new Student("小红");
        Student s2 = new Student("小亮");
        Student s3 = new Student("小明");

        ArrayList<Student> sList = new ArrayList<>();
        sList.add(s);
        sList.add(s2);
        sList.add(s3);

        Teacher t = new Teacher("张老师");
        Course course = new Course("Java", t, sList);

        t.dianMing(sList);

        course.show();

    }
}
