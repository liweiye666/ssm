package com.example.service.lmpl;

import com.example.dao.WorkServiceDao;
import com.example.domain.Work;
import com.example.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("workService")
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkServiceDao workServiceDao;

    @Override
    public List<Work> findAll(String id) {
        return workServiceDao.findAll(id);
    }

    @Override
    public void insetWork(Work work) {
        workServiceDao.insertWork(work);
    }

    @Override
    public void deleteWork(int wid){
        workServiceDao.deleteWork(wid);
    }

    @Override
    public void updateWork(Work work) {
        workServiceDao.updateWork(work);
    }

    @Override
    public List<String> queryWork(String id) {
        List<String> workName=workServiceDao.queryWork(id);
        return workName;
    }

    @Override
    public  List<Work> selectWork(String wname) {
        return workServiceDao.selectWork(wname);
    }
}
