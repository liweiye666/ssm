package com.example.service;

import com.example.domain.MStudent;
import com.example.domain.Student;

import java.util.List;

public interface StudentService {
    public Student findStudent(String sid);
    public List<Student> studentList(String id);
    public void registerStudent(Student student);
    public void registerMStudent(MStudent mStudent);
    public MStudent findMStudent(String id);
    public String findCName(String id);
    public List<Student> selectStudent(String sname);
    public List<String> selectSName(String id);
    public void updateSPWD(String sid,String pwd);
    public void updatePWD(String id,String pwd);
}
