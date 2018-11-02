package com.he.boot.service;

import com.he.boot.entity.Student;

import java.util.List;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/24 10:48
 */
public interface StudentService {
     List<Student> selectAll();

    Integer insertStudent(Student student);

}
