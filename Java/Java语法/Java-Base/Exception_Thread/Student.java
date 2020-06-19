package cn.sherlock.Exception_Thread;

public class Student {
    private int num;
    private String name;
    private int Score;

    public Student() {
    }

    public Student(int num, String name, int score) {
        this.num = num;
        this.name = name;
        Score = score;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
        //在setScore方法中设置异常
        if(score<0){
            throw new NoScoreException("分数不能为负数:"+score);
            //throw 是写在 方法体中的 因为继承了message所以直接写中文就可以了
        }else {
            System.out.println("输入格式正确："+score);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
