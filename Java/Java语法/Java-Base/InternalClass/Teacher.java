package cn.sherlock.InternalClass;

import java.util.ArrayList;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public void dianMing(ArrayList<Student> slist){//传进来一个 student 学生数组 然后再判断
        for (int i = 0; i < slist.size(); i++) {

            Student student = slist.get(i);

            //假设“小明”旷课
            if(!student.getName().equals("小明")){
                student.setCome(true);  // 如果有小明那么就旷课
            }
        }
    }
}
