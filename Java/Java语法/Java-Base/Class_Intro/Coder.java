package cn.sherlock.Class_Intro;

public class Coder {
    private String name;
    private int num;
    private double sal;

    public Coder() {
    }

    public Coder(String name, int num, double sal) {
        this.name = name;
        this.num = num;
        this.sal = sal;
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

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", sal=" + sal +
                '}';
    }

    public void intro(){
        System.out.println("姓名为: "+name+" 工号为: "+num);
    }

    public void showSalary(){
        System.out.println("薪资为: "+sal);
    }

    public void work(){
        System.out.println("Working...");
    }


}
