package cn.sherlock.Interface_Polymorphic;

public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("BBB");
    }
}
