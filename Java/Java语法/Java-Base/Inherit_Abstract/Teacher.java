package cn.sherlock.Inherit_Abstract;

public class Teacher extends Person {
    private String course;

    public Teacher() {
    }

    public Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void teach(){
        System.out.println(this.getName()+" 老师"+" 正在 "+"讲授"+this.getCourse()+"课程");
    }
}
