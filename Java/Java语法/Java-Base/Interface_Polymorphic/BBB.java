package cn.sherlock.Interface_Polymorphic;

public class BBB implements AAA {
    @Override
    public void showAAA() {
        System.out.println("AAA");
    }

    public static void showD(){
        System.out.println("DDD");
    }
}
