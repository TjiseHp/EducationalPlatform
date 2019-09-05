package com.hp.bean;

import java.util.Date;

public class Chat {
    private Integer chatNum;

    private Integer uId;

    private Integer uId2;

    private Integer cSNum;

    private String chatText;

    private Date chatDate;

    public Integer getChatNum() {
        return chatNum;
    }

    public void setChatNum(Integer chatNum) {
        this.chatNum = chatNum;
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

    public Integer getcSNum() {
        return cSNum;
    }

    public void setcSNum(Integer cSNum) {
        this.cSNum = cSNum;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText == null ? null : chatText.trim();
    }

    public Date getChatDate() {
        return chatDate;
    }

    public void setChatDate(Date chatDate) {
        this.chatDate = chatDate;
    }
}