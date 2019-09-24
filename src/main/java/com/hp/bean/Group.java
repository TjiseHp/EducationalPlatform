package com.hp.bean;

public class Group {
    private Integer gNum;

    private String gName;

    private Integer roNo;

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getRoNo() {
        return roNo;
    }

    public void setRoNo(Integer roNo) {
        this.roNo = roNo;
    }
}