package cn.sherlock.Interface_Polymorphic;

public class Test4 {
    /*

    * 语法点：接口，静态

    * 按步骤编写代码，效果如图所示：

      ![](img\4.jpg)

    * 编写步骤

    1. 定义接口AAA，普通类BBB实现接口AAA。
    2. AAA接口中，定义抽象方法showAAA。
    3. AAA接口中，定义私有静态方法show10（String str），循环打印10次str。
    4. AAA接口中，定义静态方法showB10，showC10，分别调用show10方法，传入参数。
    5. BBB类中，定义静态方法showD
    6. 测试类中，使用AAA接口，调用静态showBBB10方法，showCCC10方法，
    7. 测试类中，使用BBBB类，调用showAAAA方法，showDDD方法。

     */
    public static void main(String[] args) {
        AAA.showB10();//接口直接用 不用new
        AAA.showC10();

        BBB b = new BBB();

        b.showAAA();//要先new一个对象才能调用 接口里面的方法
        BBB.showD();//直接用类去调用自己的方法 不是抽象接口方法

    }
}
