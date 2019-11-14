package com.example.controller;

import com.example.domain.MStudent;
import com.example.domain.Work;
import com.example.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 作业模块
 */

/**
 * 作业模块
 */

@Controller
@ResponseBody
@RequestMapping("/work")
public class WorkController {

    @Autowired
    private WorkService workService;

    @CrossOrigin
    @RequestMapping(value ="/list" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public List<Work> findAll(@RequestBody Work work){      //根据学委ID找到对应的作业集合
        System.out.println(work.getId());
        System.out.println(workService.findAll(work.getId()));
        List<Work> works=workService.findAll(work.getId());
        return workService.findAll(work.getId());
    }

    @CrossOrigin
    @RequestMapping(value ="/insertWork" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public  boolean insertWork(@RequestBody Work work){
        Work w=work;
        if(w.getWName()=="" || w.getEnd()==null || w.getStart()==null || w.getWContent()=="")
            return false;           //判断输入内容是否有null，如果有返回false
        workService.insetWork(w);
        return true;
    }

    @CrossOrigin
    @RequestMapping(value ="/deleteWork" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public boolean deleteWork(@RequestBody Work work){
        System.out.println(work);
        workService.deleteWork(work.getWId());
        return true;
    }

    @CrossOrigin
    @RequestMapping(value ="/updateWork" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public boolean updateWork(@RequestBody Work work){
        Work w=work;
        if(w.getWName()=="" || w.getEnd()==null || w.getStart()==null || w.getWContent()=="")
            return false;           //判断输入内容是否有null，如果有返回false
        workService.updateWork(w);
        return true;
    }

    //根据学委的id查找所有作业的名字
    @CrossOrigin
    @RequestMapping(value="/queryWork" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public List<String> queryWork(@RequestBody MStudent mStudent) {
        System.out.println(mStudent.getId());
        List<String> workName = workService.queryWork(mStudent.getId());
        return workName;
    }

    //根据对应的作业名找到对应的作业
    @CrossOrigin
    @RequestMapping(value="/selectWork" ,method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public List<Work> selectWork(@RequestBody Work work){
        System.out.println(work.getWName());
        return workService.selectWork(work.getWName());
    }
}
