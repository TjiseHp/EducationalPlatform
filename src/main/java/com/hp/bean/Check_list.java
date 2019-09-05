package com.hp.bean;

import java.util.Date;

public class Check_list {
    private Integer listId;

    private Integer uId;

    private Integer uId2;

    private String listName;

    private Date listSTime;

    private Date listETime;

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
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

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName == null ? null : listName.trim();
    }

    public Date getListSTime() {
        return listSTime;
    }

    public void setListSTime(Date listSTime) {
        this.listSTime = listSTime;
    }

    public Date getListETime() {
        return listETime;
    }

    public void setListETime(Date listETime) {
        this.listETime = listETime;
    }
}