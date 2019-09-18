package com.hp.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Credit {
    private Integer creditNum;

    private Integer uId;

    private Integer creditSum;

    private String creditText;

    private Date creditDate;

    private String creditPreson;

    private String creditText2;   



	public Integer getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(Integer creditNum) {
        this.creditNum = creditNum;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(Integer creditSum) {
        this.creditSum = creditSum;
    }

    public String getCreditText() {
        return creditText;
    }

    public void setCreditText(String creditText) {
        this.creditText = creditText == null ? null : creditText.trim();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    public String getCreditPreson() {
        return creditPreson;
    }

    public void setCreditPreson(String creditPreson) {
        this.creditPreson = creditPreson == null ? null : creditPreson.trim();
    }

    public String getCreditText2() {
        return creditText2;
    }

    public void setCreditText2(String creditText2) {
        this.creditText2 = creditText2 == null ? null : creditText2.trim();
    }
}