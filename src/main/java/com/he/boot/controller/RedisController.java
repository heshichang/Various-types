package com.he.boot.controller;

import com.he.boot.entity.Student;
import com.he.boot.service.impl.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/3 12:56
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/set")
    public String set(Model model) {
        boolean res = false;
        res = redisService.set("sex", "男");
        if (res) {
            model.addAttribute("result", redisService.get("sex"));
        } else {
            model.addAttribute("result", "fail");
        }
        return "redis/result";
    }

    @GetMapping("/hashsetget")
    public String hashSet(Model model) {
        Student student = new Student();
        student.setSid(1);
        student.setSex("女");
        student.setSname("小红");
        HashMap<String,Student> map = new HashMap<>();
        map.put("s1",student);
        Student student1 = new Student();
        student1.setSid(2);
        student1.setSex("男");
        student1.setSname("小明");
        map.put("s2",student1);
        redisService.hmset("students", "st", map);
        model.addAttribute("result", "success");
        System.out.println(redisService.hmGet("students", "st"));
        return "redis/result";
    }

    @GetMapping("/setlist")
    public String setList(Model model){
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setSid(1);
        student.setSex("女");
        student.setSname("小红");
        Student student1 = new Student();
        student1.setSid(2);
        student1.setSex("男");
        student1.setSname("小明");
        students.add(student);
        students.add(student1);
        redisService.lPush("ls",students);
        model.addAttribute("result", "success");
        System.out.println(redisService.lRange("ls"));
        return "redis/result";
    }

    @GetMapping("/delete")
    public String delete(){
        String key = "set";
        redisService.delete(key);
        return "redis/result";
    }

    @GetMapping("/add")
    public String add(){
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        redisService.add("set",set);
        System.out.println(redisService.getset("set"));
        return "redis/result";
    }





}
