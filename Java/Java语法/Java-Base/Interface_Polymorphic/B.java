package cn.sherlock.Interface_Polymorphic;

public class B implements A {
    @Override
    public void showA() {
        System.out.println("重写showA");
    }
}
