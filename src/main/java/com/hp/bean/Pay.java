package com.hp.bean;

import java.util.Date;

public class Pay {
    private Integer payNum;

    private Integer uId;

    private Integer payText;

    private Date payDate;

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getPayText() {
        return payText;
    }

    public void setPayText(Integer payText) {
        this.payText = payText;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}