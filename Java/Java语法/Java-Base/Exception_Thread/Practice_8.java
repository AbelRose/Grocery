package cn.sherlock.Exception_Thread;

public class Practice_8 {
    /*
    自定义异常类(自己可以根据异常的条件创建一个异常类)
    Q:
      请使用代码实现
        每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
        如果老师给学生赋值一个负数,抛出一个自定异常
     */
    public static void main(String[] args) {
        Student stu = new Student();
        try {
            //用setScore方法设置分数 模拟老师
            stu.setScore(100);
            stu.setScore(-100);
        }catch (NoScoreException e){
            System.out.println(e);

        }
    }
}
