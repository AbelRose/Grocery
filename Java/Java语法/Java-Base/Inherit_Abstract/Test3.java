package cn.sherlock.Inherit_Abstract;

public class Test3 {
    /*

    * 编写步骤：

     1. 模拟农学院动物医疗系统信息。
     2. 定义抽象家禽类(Poultry)
      1. 私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
      2. 提供空参和带参构造方法
      3. 成员方法：
          1. 抽象方法症状(showSymptom)
          2. 普通方法基本信息(showMsg)
          3. 提供setXxx和getXxx方法
     3. 定义普通鸭子类(Duck)
      1. 提供空参和带参构造方法
      2. 重写showSymptom方法，打印症状信息。

     */
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",1,"感冒");
        duck.showMsg();
        System.out.println("------");
        duck.showSymptom();
    }
}
