package com.example.domain;

public class MStudent {
    private String id;     //学生学号
    private String sname;    //学生姓名
    private String pwd;     //学生密码
    private String cname;   //所属班级

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
