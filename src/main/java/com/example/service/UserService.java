package com.example.service;


import com.example.domain.MStudent;
import com.example.domain.Student;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {

    public Student getStudent(String sid,String pwd);
    public MStudent getStudent1(String sid, String pwd);
}
