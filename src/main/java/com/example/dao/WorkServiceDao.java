package com.example.dao;

import com.example.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface WorkServiceDao {
    public List<Work> findAll(String id);    //根据学委的学号找到所有的作业信息

    public void insertWork(Work work);         //添加作业信息

    public void deleteWork(int wid);            //根据作业编号删除作业

    public void updateWork(Work work);          //更新作业信息

    public List<String> queryWork(String id);           //根据学委的学号找到对应的作业名

    public List<Work> selectWork(String wname);           //根据作业的姓名找到对应的作业
}
