package com.hp.bean;

public class Chat_status {
    private Integer cSNum;

    private String cStatus;

    public Integer getcSNum() {
        return cSNum;
    }

    public void setcSNum(Integer cSNum) {
        this.cSNum = cSNum;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus == null ? null : cStatus.trim();
    }
}