package cn.sherlock.Inherit_Abstract;

public class Test4 {
    /*

    * 编写步骤：

      1. 模拟教学管理系统师生信息。
      2. 定义Person类。
         1. 属性：姓名、年龄
         2. 构造方法：无参构造方法，有参构造方法
         3. 成员方法：getXxx方法，setXxx方法，显示基本信息showMsg方法
      3. 定义Teacher类，继承Person
         1. 属性：学科
         2. 构造方法：无参构造方法，有参构造方法
         3. 成员方法：getXxx方法，setXxx方法，讲课方法
      4. 定义Student类，继承Person
         1. 属性：分数
         2. 构造方法：无参构造方法，有参构造方法
         3. 成员方法：getXxx方法，setXxx方法，考试方法

     */
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三",1,"Java");
        teacher.teach();
        System.out.println("-------------------");
        Student student = new Student("李四",2,50);
        student.Exma();
    }
}
