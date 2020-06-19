package cn.sherlock.Class_Intro;

public class Practice_5 {
    /*
    ## 第四题：语法练习

    - 定义一个扑克Card类。
      - 属性：
        - 花色
        - 点数
    - 构造方法：
        - 满参构造方法
    - 成员方法：
        - showCard方法：打印牌面信息
    - 定义测试类，创建Card对象，调用showCard方法。

    - 代码实现，效果如图所示：

    ![](img\5.jpg)

     */
    public static void main(String[] args) {

        Card card = new Card("黑桃", "A");

        card.showCard();
    }
}
