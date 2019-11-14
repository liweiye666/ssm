package com.example.service;

import com.example.domain.Work;

import java.util.List;

public interface WorkService {
    public List<Work> findAll(String id);           //根据id找到所有作业
    public void insetWork(Work work);           //插入作业
    public void deleteWork(int wid);           //删除作业
    public void updateWork(Work work);           ///修改作业
    public List<String> queryWork(String id);           //根据学委的id找到对应的作业名
    public List<Work> selectWork(String wname);       //根据作业的名字找到对应的作业
}
