package cn.sherlock.InternalClass;

public class Student {
    private String name;
    private boolean come;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, boolean come) {
        this.name = name;
        this.come = come;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCome() {
        return come;
    }

    public void setCome(boolean come) {
        this.come = come;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", come=" + come +
                '}';
    }

}
