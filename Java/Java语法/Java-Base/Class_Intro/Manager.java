package cn.sherlock.Class_Intro;

public class Manager {
    private String name;
    private int num;
    private double sal;
    private double salpro;//奖金

    public Manager() {
    }

    public Manager(String name, int num, double sal, double salpro) {
        this.name = name;
        this.num = num;
        this.sal = sal;
        this.salpro = salpro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSalpro() {
        return salpro;
    }

    public void setSalpro(double salpro) {
        this.salpro = salpro;
    }

    public void intro(){
        System.out.println("姓名为: "+name+" 工号为: "+num);
    }

    public void showSalary(){
        System.out.println("薪资为: "+ sal + " 奖金为: "+salpro);
    }

    public void work(){
        System.out.println("干...");
    }
}
