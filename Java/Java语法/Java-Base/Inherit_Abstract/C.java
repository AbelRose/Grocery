package cn.sherlock.Inherit_Abstract;

public class C extends B {

    int numc = 30;

    @Override
    public void showA() {
        System.out.println("打印numa "+super.numa);
    }

    @Override
    public void showB() {
        System.out.println("打印numb "+super.numb);
    }

    public void showC(){
        System.out.println("打印numb "+this.numc);
    }

}
