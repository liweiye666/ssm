package com.example.dao;

import com.example.domain.MStudent;
import com.example.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentServiceDao {
    //根据学生学号找到对应的学生信息
    public Student findStudent(String sid);

    //根据学委学号找到对应的学生集合
    public List<Student> studentList(String id);

    //学生注册
    public void registerStudent(Student student);

    //学委注册
    public void registerMStudent(MStudent mStudent);

    //根据学委id找到对应的学委对象
    public MStudent findMStudent(String id);

    //根据学委id找到对应的班级名
    public String findCName(String id);

    //根据学生的姓名找到对应的学生信息
    public List<Student> selectStudent(String sname);

    //根据学委的学号找到对应的所有学生姓名
    public List<String> selectSName(String id);

    //修改学生的密码
    public void updateSPWD(@Param("sid") String sid, @Param("pwd") String pwd);

    //修改学委的密码
    public void updatePWD(@Param("id") String sid, @Param("pwd") String pwd);
}
