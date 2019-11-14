package com.example.service;

import com.example.domain.MStudent;
import com.example.domain.Student;

import java.util.List;

public interface StudentService {
    public Student findStudent(String sid);                 //找到学生对应的学委学号
    public List<Student> studentList(String id);             //返回学生的集合
    public void registerStudent(Student student);               //学生注册
    public void registerMStudent(MStudent mStudent);            //学委注册
    public MStudent findMStudent(String id);                  //根据id找到学委对象
    public String findCName(String id);                      //根据学委学号找到对应的班级名
    public List<Student> selectStudent(String sname);          //根据学生的姓名找到对应的学生信息
    public List<String> selectSName(String id);              //根据学委学号找到所有的学生姓名
    public void updateSPWD(String sid,String pwd);           //学生修改密码处理
    public void updatePWD(String id,String pwd);             //学委修改密码处理
}
