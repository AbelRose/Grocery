package cn.sherlock.Inherit_Abstract;

public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void Exma(){
        System.out.println(this.getName()+" 学生"+" 正在 参加考试 "+"分数为:"+this.getScore());
    }
}
