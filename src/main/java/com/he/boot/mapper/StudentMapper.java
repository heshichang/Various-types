package com.he.boot.mapper;

import com.he.boot.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findAll();

    Integer insertStudent(Student student);


}
