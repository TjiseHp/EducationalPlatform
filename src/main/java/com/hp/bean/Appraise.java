package com.hp.bean;

import java.util.Date;

public class Appraise {
    private Integer appraiseNum;

    private Integer uId;

    private Integer uId2;

    private Integer aLeave;

    private String aText;

    private Date aDate;

    public Integer getAppraiseNum() {
        return appraiseNum;
    }

    public void setAppraiseNum(Integer appraiseNum) {
        this.appraiseNum = appraiseNum;
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

    public Integer getaLeave() {
        return aLeave;
    }

    public void setaLeave(Integer aLeave) {
        this.aLeave = aLeave;
    }

    public String getaText() {
        return aText;
    }

    public void setaText(String aText) {
        this.aText = aText == null ? null : aText.trim();
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }
}