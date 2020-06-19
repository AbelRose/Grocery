package cn.sherlock.Class_Intro;

public class Practice_2 {
    /*
    ## 第二题：语法练习

    * 定义一个圆形Circle类。
      * 属性：
        * r：半径
      * 构造方法：
        * 无参构造方法
        * 满参构造方法
      * 成员方法：
        * get/set方法
        * showArea方法：打印圆形面积
        * showPerimeter方法：打印圆形周长
    * 定义测试类，创建Circle对象，并测试。

    * 代码实现，效果如图所示：
      ![](img\2.jpg).


    * 开发提示：

      > 面向周长公式：2 * 3.14*  半径
      >
      > 圆形面积公式：3.14* 半径^2
     */
    public static void main(String[] args) {
        Circle c = new Circle(1);//这个地方地方呢 就是调用的有参构造方法(很智能 自己判断)
        c.setR(5);
        System.out.println(c.getR());
        System.out.println("----------");
        c.showArea(c.getR());
        System.out.println("----------");
        c.showPerimeter(c.getR());
    }
}
