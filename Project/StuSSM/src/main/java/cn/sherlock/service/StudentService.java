package cn.sherlock.service;

import cn.sherlock.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 问题： 为什么不直接使用 Dao 类而是还要在上面封装一层 Service 层呢？
     * 回答：
     * 基于责任分离的原则，Dao 层就应该专注于对数据库的操作，
     * 而在 Service 层我们可以增加一些非 CRUD 的方法
     * 去更好的完成本身抽离出来的 service 服务（业务处理）。
     * @return
     */

    int getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start , int count);
}
