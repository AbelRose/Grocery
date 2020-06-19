package cn.sherlock.Interface_Polymorphic;

public interface AA {
    public abstract void showAA();

    public default void show10B(){
        show10("BBB");
    }

    public default void show10C(){
        show10("CCC");
    }

    default void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.println("str");
        }
        System.out.println();
    }
}
