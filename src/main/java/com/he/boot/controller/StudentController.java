package com.he.boot.controller;

import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.he.boot.aspect.annotation.LoginAnnotation;
import com.he.boot.entity.Generic;
import com.he.boot.entity.Student;
import com.he.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/24 10:37
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @LoginAnnotation
    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","消息");
        return "js_practice";
    }


    @GetMapping("/select")
    public String select(Model model){
        model.addAttribute("msg","消息");
        Generic<Student> studentGeneric = new Generic<Student>();
        studentGeneric.setLsit(studentService.selectAll());
        model.addAttribute("students",studentService.selectAll());
        String a="test";
        model.addAttribute("pagenum",4);
        return a;
    }

    @GetMapping("/call")
    public String call(Model model){
        model.addAttribute("msg","消息");
        return "js_practice";
    }

    @GetMapping("/joint")
    @Login(action = Action.Normal)
    public String joit(Model model){
        model.addAttribute("students",studentService.selectAll());
        return "joint";
    }

    @GetMapping("/unidex")
    public String unidex(){
        Student student = new Student();
        student.setSname("反倒是");
        student.setSex("男");
        int i = 0;
        try {
            i = studentService.insertStudent(student);
        } catch (Exception e) {
            System.out.println("名字存在不插入");
        }

        return "success";
    }

    @GetMapping("/login")
    public String login(Integer uid){

        return "joint";
    }

}
