package cn.sherlock.Class_Intro;

public class Practice_6 {
    /*
    ## 第五题：语法练习

* 定义两个类，经理类Manager，程序员类Coder
* Coder类：
  - 属性：姓名，工号，薪资
  - 构造方法：无参构造方法，满参构造方法
  - 成员方法：
    - get/set方法
    - intro方法：打印姓名，工号信息
    - showSalary方法：打印薪资信息
    - work方法：打印工作信息
* Manager类：
  - 属性：姓名，工号，薪资
    - 经理的薪资有两部分组成：基本工资+奖金
  - 构造方法：无参构造方法，满参构造方法
  - 成员方法：
    - get/set方法
    - intro方法：打印姓名，工号信息
    - showSalary方法：打印薪资信息
    - work方法：打印工作信息

* 定义测试类，创建Manager对象，创建Coder对象，并测试。

- 代码实现，效果如图所示：

  ![](img/4.jpg)
     */
    public static void main(String[] args) {
        Manager manager = new Manager("张三",1,100000,100000);
        Coder coder = new Coder("李四",2,5000);

        manager.intro();
        manager.showSalary();
        manager.work();

        System.out.println("===============");

        coder.intro();
        coder.showSalary();
        coder.work();

    }
}
