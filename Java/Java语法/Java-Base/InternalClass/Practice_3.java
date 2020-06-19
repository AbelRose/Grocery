package cn.sherlock.InternalClass;

import java.util.ArrayList;

public class Practice_3 {
    /*

    * 模拟接待员接待用户，根据用户id，给用户分组。

- 定义接口Filter：
  - 提供抽象方法filterUser（User u）
- 定义用户类：
  - 属性：用户类型，用户id
  - 提供基本的构造方法和get方法，set方法
- 定义接待员类：
  - 属性：接口Filter
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：接待用户方法，设置用户类型。
- 测试类：
  - 初始化50个User对象，id为1-50。
  - 创建三个接待员对象。
    - 第一个接待员，设置接待规则，将10-19号用户类型设置为v1。
    - 第二个接待员，设置接待规则，将20-29号用户类型设置为v2。
  - 遍历用户集合，给用户分区。

     */
    public static void main(String[] args) {

        ArrayList<User> ulist = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            ulist.add(new User(i));
        }

        System.out.println("未分组");
        System.out.println(ulist);

        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();

        r1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if(u.getId() >= 10 && u.getId() < 20){
                    u.setType("v1");
                }
            }
        });

        r2.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if(u.getId() >= 20 && u.getId() < 30){
                    u.setType("v2");
                }
            }
        });

        for (int i = 0; i < ulist.size(); i++) {

            User user = ulist.get(i);
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }

        System.out.println("已分组:");

        for (int i = 0; i < ulist.size(); i++) {
            User user = ulist.get(i);
            if(i % 9 == 0){
                System.out.println();
            }
            System.out.println(user + " ");
        }





    }
}
