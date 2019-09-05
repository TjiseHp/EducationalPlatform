package com.hp.bean;

public class Class {
    private Integer classNum;

    private String classKind;

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public String getClassKind() {
        return classKind;
    }

    public void setClassKind(String classKind) {
        this.classKind = classKind == null ? null : classKind.trim();
    }
}