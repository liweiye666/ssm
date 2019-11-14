package com.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Work {

    private int wid;     //作业编号
    private String wname;       //作业名
    private String wcontent;    //作业内容

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date startTime;     //发布时间

    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date endTime;       //截止时间
    private String id;      //学委id

    public int getWId() {
        return wid;
    }

    public void setWId(int wid) {
        this.wid = wid;
    }

    public String getWName() {
        return wname;
    }

    public void setWName(String wname) {
        this.wname = wname;
    }

    public String getWContent() {
        return wcontent;
    }

    public void setWContent(String wcontent) {
        this.wcontent = wcontent;
    }

    public Date getStart() {
        return startTime;
    }

    public void setStart(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEnd() {
        return endTime;
    }

    public void setEnd(Date endTime) {
        this.endTime = endTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
