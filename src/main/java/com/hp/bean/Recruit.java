package com.hp.bean;

import java.util.Date;

public class Recruit {
    private Integer recruitNum;

    private Integer uId;

    private Integer uId2;

    private Integer cNum;

    private Integer classNum;

    private Date recruitSTime;

    private Date recruitEDate;

    private String recruitText;

    public Integer getRecruitNum() {
        return recruitNum;
    }

    public void setRecruitNum(Integer recruitNum) {
        this.recruitNum = recruitNum;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getuId2() {
        return uId2;
    }

    public void setuId2(Integer uId2) {
        this.uId2 = uId2;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public Date getRecruitSTime() {
        return recruitSTime;
    }

    public void setRecruitSTime(Date recruitSTime) {
        this.recruitSTime = recruitSTime;
    }

    public Date getRecruitEDate() {
        return recruitEDate;
    }

    public void setRecruitEDate(Date recruitEDate) {
        this.recruitEDate = recruitEDate;
    }

    public String getRecruitText() {
        return recruitText;
    }

    public void setRecruitText(String recruitText) {
        this.recruitText = recruitText == null ? null : recruitText.trim();
    }
}