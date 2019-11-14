package com.example.service.lmpl;

import com.example.dao.UserServiceDao;
import com.example.domain.MStudent;
import com.example.domain.Student;
import com.example.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceDao userServiceDao;

    @Override
    public Student getStudent(String sid,String pwd){
        return userServiceDao.getStudent(sid,pwd);   //返回学生对象
    }

    @Override
    public MStudent getStudent1(String sid, String pwd){
        return userServiceDao.getStudent1(sid,pwd);   //返回学生对象
    }
}
