package cn.sherlock.InternalClass;

public interface FightAble {
    public abstract void specialFight();//定义方法的时候要加上括号

    public default void commonFight(){
        System.out.println("普通打击");
    }

}
