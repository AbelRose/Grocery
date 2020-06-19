package cn.sherlock.InternalClass;

public class Practice_5 {
    /*

    - 模拟玩家选择角色。

    - 定义接口FightAble：

      - 抽象方法：specialFight。
      - 默认方法：commonFight,方法中打印"普通打击"。

    - 定义战士类：

      - 实现FightAble接口,重写方法中打印"武器攻击"。

    - 定义法师类：

      - 实现FightAble接口,重写方法中打印"法术攻击"。

    - 定义玩家类Player：

      - 成员方法：FightAble select(String str)，根据指令选择角色。
        - 法力角色，选择法师。
        - 武力角色，选择战士。

     */
    public static void main(String[] args) {
        Player player = new Player();
        String select = "法力角色";
        System.out.println("选择：" + select);

        FightAble f = player.select(select);
        f.specialFight();
        f.commonFight();

        System.out.println("============");

        select = "武力角色";
        System.out.println("选择：" + select);

        FightAble f2 = player.select(select);
        f2.specialFight();
        f2.commonFight();
    }
}
