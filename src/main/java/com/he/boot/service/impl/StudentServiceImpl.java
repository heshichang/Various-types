package com.he.boot.service.impl;

import com.he.boot.entity.Student;
import com.he.boot.mapper.StudentMapper;
import com.he.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/24 10:50
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.findAll();
    }

    @Override
    public Integer insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }
}
