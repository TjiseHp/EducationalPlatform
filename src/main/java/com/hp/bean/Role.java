package com.hp.bean;

public class Role {
    private Integer roNo;

    private String roName;

    private String roText;

    public Integer getRoNo() {
        return roNo;
    }

    public void setRoNo(Integer roNo) {
        this.roNo = roNo;
    }

    public String getRoName() {
        return roName;
    }

    public void setRoName(String roName) {
        this.roName = roName == null ? null : roName.trim();
    }

    public String getRoText() {
        return roText;
    }

    public void setRoText(String roText) {
        this.roText = roText == null ? null : roText.trim();
    }
}