package com.example.service.lmpl;

import com.example.dao.StudentServiceDao;
import com.example.domain.MStudent;
import com.example.domain.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentServiceDao studentServiceDao;

    @Override
    public Student findStudent(String sid) {
        return studentServiceDao.findStudent(sid);     //根据sid找到该student对象
    }

    @Override
    public List<Student> studentList(String id) {
        List<Student> stu=studentServiceDao.studentList(id);        //找到对应的学生集合
        return stu;
    }

    @Override
    public void registerStudent(Student student) {          //学生注册
        studentServiceDao.registerStudent(student);
    }

    @Override
    public void registerMStudent(MStudent mStudent) {       //学委注册
        studentServiceDao.registerMStudent(mStudent);
    }

    @Override
    public MStudent findMStudent(String id){
        return studentServiceDao.findMStudent(id);              //根据id返回学委对象
    }

    @Override
    public String findCName(String id) {        //根据学委id找到对应的班级名
        String cname=studentServiceDao.findCName(id);
        return cname;       //返回对应的班级名
    }

    @Override
    public List<Student> selectStudent(String sname) {          //根据学生姓名找到学生的对象
        return studentServiceDao.selectStudent(sname);
    }

    @Override
    public List<String> selectSName(String id) {            //根据学委的ID找到所有学生的姓名
        return studentServiceDao.selectSName(id);
    }

    @Override
    public void updateSPWD(String sid,String pwd) {         //根据学生ID修改学生的密码
        studentServiceDao.updateSPWD(sid,pwd);
    }

    @Override
    public void updatePWD(String id,String pwd) {           //根据学委ID修改学委的密码
        studentServiceDao.updatePWD(id, pwd);
    }
}
