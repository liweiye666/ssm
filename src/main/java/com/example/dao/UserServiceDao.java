package com.example.dao;

import com.example.domain.MStudent;
import com.example.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserServiceDao {

    public Student getStudent(@Param("sid") String sid, @Param("pwd") String pwd);

    public MStudent getStudent1(@Param("id") String id, @Param("pwd") String pwd);
}
