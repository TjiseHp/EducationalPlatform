package com.hp.bean;

public class Role {
    private Integer rNum;

    private String rName;

    private String rRemarks;

    public Integer getrNum() {
        return rNum;
    }

    public void setrNum(Integer rNum) {
        this.rNum = rNum;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrRemarks() {
        return rRemarks;
    }

    public void setrRemarks(String rRemarks) {
        this.rRemarks = rRemarks == null ? null : rRemarks.trim();
    }
}