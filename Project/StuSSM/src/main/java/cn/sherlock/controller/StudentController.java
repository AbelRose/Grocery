package cn.sherlock.controller;


import cn.sherlock.entity.Student;
import cn.sherlock.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.sherlock.util.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ALL")
@Controller
@RequestMapping("")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/addStudent")
    public String addStudent(HttpServletRequest request, HttpServletResponse response){

        Student student = new Student();

        int studentId = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        Date birthday = null;
        //request.getParameter("birthday"); 需要进行格式转换
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        student.setStudent_id(studentId);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setBirthday(birthday);

        studentService.addStudent(student);

        return "redirect:listStudent";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id){
        studentService.deleteStudent(id);
        return "redirect:listStudent";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(HttpServletRequest request,HttpServletResponse response){

        Student student = new Student();

        int studentId = Integer.parseInt(request.getParameter("student_id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        Date birthday = null;
        //request.getParameter("birthday"); 需要进行格式转换
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        student.setStudent_id(studentId);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);
        student.setBirthday(birthday);

        studentService.updateStudent(student);

        return "redirect:listStudent";
    }

    @RequestMapping("/listStudent")
    public String listStudent(HttpServletRequest request,HttpServletResponse response){

        int start = 0;
        int count = 10;

        try {
            start = Integer.parseInt(request.getParameter("page.start"));
            count = Integer.parseInt(request.getParameter("page.count"));
        }catch (Exception e){

        }

        Page page = new Page(start, count);

        List<Student> students = studentService.list(page.getStart(),page.getCount());




        return "listStudent";
    }








}
