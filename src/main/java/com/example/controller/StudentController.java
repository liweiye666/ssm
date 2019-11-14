package com.example.controller;

import com.example.domain.MStudent;
import com.example.domain.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @CrossOrigin
    @RequestMapping(value ="/xueId" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String getXueId(@RequestBody Student student){
        Student stu=studentService.findStudent(student.getSid());
        return stu.getId();         //找到学生对应的学委学号
    }


    @CrossOrigin
    @RequestMapping(value = "/studentList" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public List<Student> studentList(@RequestBody MStudent mstudent)
    {
        List<Student> stu=studentService.studentList(mstudent.getId());
        return stu;      //返回学生的集合
    }

    //学生注册
    @CrossOrigin
    @RequestMapping("/registerStudent")
    public boolean registerStudent(@RequestBody Student student){
        Student stu=student;
        String id=stu.getId();
        MStudent ms=studentService.findMStudent(id);         //判断该学委是否存在
        if(ms!=null){
            studentService.registerStudent(stu);
            return true;
        }
        else
            return false;
    }

    //根据json的传输的学生id找到对应的学生对象
    @CrossOrigin
    @RequestMapping("/findStudent")
    public boolean findStudent(@RequestBody Student student){
        String sid=student.getSid();
        Student stu=studentService.findStudent(sid);
        if(stu==null)
            return true;
        else
            return false;
    }

    //学委注册
    @CrossOrigin
    @RequestMapping("/registerMStudent")
    public Boolean registerMStudent(@RequestBody MStudent mstudent){
        MStudent ms=studentService.findMStudent(mstudent.getId());
        if(ms==null){
            studentService.registerMStudent(mstudent);
            return true;
        }
        else
            return false;
    }

    //根据学委学号找到对应的班级名
    @CrossOrigin
    @RequestMapping(value="/findCName",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String findCname(@RequestBody MStudent mStudent){
        String s=mStudent.getId();
        String cname=studentService.findCName(mStudent.getId());
        return cname;
    }

    //根据学委学号找到所有的学生姓名
    @CrossOrigin
    @RequestMapping(value = "/selectSName",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public List<String> selectSName(@RequestBody MStudent mStudent){
        return studentService.selectSName(mStudent.getId());
    }

    //根据学生的姓名找到对应的学生信息
    @CrossOrigin
    @RequestMapping(value = "/selectStudent",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public List<Student> selectStudent(@RequestBody Student student){
        return studentService.selectStudent(student.getSname());
    }


    //学生修改密码处理
    @CrossOrigin
    @RequestMapping(value="/updateSPWD",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Boolean updateSPWD(@RequestBody Student student){
        String pwd=student.getPwd();             //得到前端传过来的学生密码
        String sid=student.getSid();             //得到前端传过来的学生ID
        Student s=studentService.findStudent(sid);
        if(s!=null){
            studentService.updateSPWD(sid,pwd);
            return true;
        }
        return false;
    }

    //学委修改密码处理
    @CrossOrigin
    @RequestMapping(value="/updatePWD",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Boolean updatePWD(@RequestBody MStudent mstudent){
        String pwd=mstudent.getPwd();           //得到前端传过来的学委ID
        String id=mstudent.getId();             //得到前端传过来的学委ID
        MStudent ms=studentService.findMStudent(id);
        if(ms!=null){
            studentService.updatePWD(id,pwd);
            return true;
        }
        return false;
    }
}