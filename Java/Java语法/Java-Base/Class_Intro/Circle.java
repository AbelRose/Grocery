package cn.sherlock.Class_Intro;

public class Circle {
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void showArea(int r){
        System.out.println("圆的面积是"+ 3.14*r*r);
    }

    public void showPerimeter(int r){
        System.out.println("圆的周长是"+ 2*3.14*r);
    }
}
