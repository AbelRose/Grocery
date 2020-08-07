### Design Patterns

- 设计模式的本质是面向对象设计原则的实际运用，是对类的封装性、继承性和多态性以及类的关联关系和组合关系的充分理解。

| 范围\目的 | 创建型模式                   | 结构型模式                                        | 行为型模式                                                   |
| --------- | ---------------------------- | ------------------------------------------------- | ------------------------------------------------------------ |
| 类模式    | 工厂方法                     | (类）适配器                                       | 模板方法、解释器                                             |
| 对象模式  | 单例  原型  抽象工厂  建造者 | 代理  (对象）适配器  桥接  装饰  外观  享元  组合 | 策略  命令  职责链  状态  观察者  中介者  迭代器  访问者  备忘录 |

> 23 种设计模式不是孤立存在的，很多模式之间存在一定的关联关系

- 七个原则

  - 开闭原则(Open Closed Principle， OCP) --- ***终极原则***

    软件实体应该对**扩展开放** **对修改关闭** 。当应用的需求改变时，在不修改软件实体的源代码或者二进制代码的前提下，可以扩展模块的功能，使其满足新的需求。

    ***作用***: 1) 软件测试(只对扩展的代码进行测试) 2) 提高代码的可复用性(粒度越小 被复用的可能性就越大) 3) 提高软件的可维护性

    ***方法***:  “抽象约束 封装变化”

  ![Windows的桌面主题类图](Design-Patterns.assets/3-1Q113100151L5.gif)

  

  - 里氏替换原则(Liskov Substitution Principle, LSP)

    继承必须确保***超类***所拥有的性质在***子类***中仍然成立

    ***作用:*** 1) 实现**开闭原则**的重要方式之一 2) 克服了重写父类造成的**可复用性变差**的特点 3) 动作**正确性**的保证

    ***方法:*** 子类**可以扩展**父类的功能，但**不能改变**父类原有的功能 

    如果违背了李氏替换原则 那么继承类的对象在基类出现的地方会出现于运行错误 此时应该重新设计他们的关系

    "正方形不是长方形"

    “几维鸟不是鸟”

  ![“几维鸟不是鸟”实例的类图](Design-Patterns.assets/3-1Q11311094H32.gif)

  ```java
  package principle;
  public class LSPtest
  {
      public static void main(String[] args)
      {
          Bird bird1=new Swallow();
          Bird bird2=new BrownKiwi();
          bird1.setSpeed(120);
          bird2.setSpeed(120);
          System.out.println("如果飞行300公里：");
          try
          {
              System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
              System.out.println("几维鸟将飞行"+bird2.getFlyTime(300)+"小时。");
          }
          catch(Exception err)
          {
              System.out.println("发生错误了!");
          }
      }
  }
  //鸟类
  class Bird
  {
      double flySpeed;
      public void setSpeed(double speed)
      {
          flySpeed=speed;
      }
      public double getFlyTime(double distance)
      {
          return(distance/flySpeed);
      }
  }
  //燕子类
  class Swallow extends Bird{}
  //几维鸟类
  class BrownKiwi extends Bird
  {
      public void setSpeed(double speed)
      {
             flySpeed=0;
      }
  }
  ```

  ​		“几维鸟是鸟”

  > 程序运行错误的原因是：几维鸟类重写了鸟类的 setSpeed(double speed)  方法，这**违背了**里氏替换原则。
  >
  > 正确的做法是：取消几维鸟原来的**继承关系**，定义鸟和几维鸟的**更一般**的父类，如**动物类**，它们都有奔跑的能力。几维鸟的飞行速度虽然为 0，但**奔跑速度**不为 0，可以计算出其奔跑 300 千米所要花费的时间。其类图如图所示。

  ​	![“几维鸟是动物”实例的类图](Design-Patterns.assets/3-1Q11311101SN.gif)

  

  - 依赖倒置原则(Dependence Inversion Principle, DIP)

    高层模块不应该依赖底层模块 两者都应该依赖其***抽象*** ,  抽象不应该依赖细节 细节应该依赖抽象。

    ***面向接口*** 编程 而不是面向实现编程 。实现开闭原则的重要途径之一，降低了客户与实现模块之间的耦合

    作用: 1) 降低类之间的耦合性 2) 提高系统的稳定性 3) 减少并行开发的风险 4) 提高代码的可读性和可维护性

    原则: 1) ***每个类*** 尽量提供接口或抽象类，或者两者都具备 2) ***变量*** 的声明类型尽量是接口或者是抽象类 3) 任何类都不应该从***具体类*** 派生 4) 使用继承时尽量遵循***里氏替换*** 原则

    方法: 

    “顾客购物程序”

    > 顾客**每更换**一家商店，都要修改一次代码，这明显违背了开闭原则。
    >
    > 存在以上缺点的原因是：顾客类设计时同具体的商店类**绑定了**，这违背了依赖倒置原则。
    >
    > 解决方法是：定义“婺源网店”和“韶关网店”的**共同接口 Shop**，顾客类面**向该接口编程**，其代码修改如下：

    ```java
    class Customer
    {
        public void shopping(Shop shop)
        {
            //购物
            System.out.println(shop.sell());
        }
    }
    ```

    ![顾客购物程序的类图](Design-Patterns.assets/3-1Q113131610L7.gif)

  

  - 单一职责原则

    aaa

    作用:

    方法: 

  

  

  

  

  

  

  

  

  - 接口隔离原则

- 创建型模式的特点和分类

- 单例模式





















