package cn.sherlock.Interface_Polymorphic;

public class Sun extends Star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("Sun is doAnything...");
    }
}
