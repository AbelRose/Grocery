package cn.sherlock.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_9 {
    /*

    ## 第十题：需求实现

* 模拟用户登录。

  * 定义用户类，属性为用户名和密码。
  * 使用集合存储多个用户对象。
  * 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
  * 登录失败时，当用户名错误，提示没有该用户。
  * 登录失败时，当密码错误时，提示密码有误。

* 代码实现，效果如图所示：

  ![](img\10.jpg)

     */


    //static 关键字的用途 方便在没有创建对象的时候调用 方法/变量
    //写在 main()方法外面

    static ArrayList<User> users = new ArrayList<>();//注意这个ArrayList 里面传的是User 返回的是一个User类的集合
    static {
        users.add(new User("张三","123"));
        users.add(new User("李四","456"));
        for (int i = 0; i < users.size(); i++) {
            users.get(i).show();
        }
        System.out.println("--------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = sc.nextLine();
        System.out.println("请输入密码:");
        String pw = sc.nextLine();
        User u = new User(name,pw);//传入一个有参的对象
        String login = login(u);//创建一个方法 返回登陆是否成功 返回一个字符串
        System.out.println("登陆结果: "+login);


        //失败的代码.......:(
//        for (int i = 0; i < users.size(); ) {
//
//            //这一步很重要!!! 首先要从static里面获取到对象
//            User user = users.get(i);
//
//            if((name.equals(user.getName())) && (pw.equals(user.getPassword()))){
//                System.out.println("用户名和密码正确");
//                return;
//            }else{
////                System.out.println("NONONONO~~~");
//            }
//        }
    }

    private static String login(User u) {
        String msg = "";
        String n = u.getName();//从static里面得来的用户名字
        String p = u.getPassword();//从static里面得来的密码

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);//定义一个用户并且取出名字和密码用来检验判断 传进来的User u 是否满足条件
            String name = user.getName();
            String password = user.getPassword();

            boolean flag = true;
                if (name.equals(n)) {//首先判断名字是否相同
                    if (p.equals(password)) {//再判断密码是否相同
                        return "登陆成功";
                    } else {
                        return "密码错误";
                    }
                } else {
                    msg = "用户名不存在";
//                continue;
                }
            }

        return msg;

    }
}

