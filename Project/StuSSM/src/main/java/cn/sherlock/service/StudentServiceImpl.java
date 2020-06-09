package cn.sherlock.service;

import cn.sherlock.dao.StudentDao;
import cn.sherlock.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl {
    /**
     *
     * StudentService实现类
     */

    @Autowired
    StudentDao studentDao;

    private int getTotal(){
        return studentDao.getTotal();
    }

    private void addStudent(Student student){
        studentDao.addStudent(student);
    }

    private void deleteStudent(int id){
        studentDao.deleteStudent(id);
    }

    private void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    private Student getStudent(int id){
        return studentDao.getStudent(id);
    }

    private List<Student> list(int start , int count){
        return studentDao.list(start,count);
    }
}
