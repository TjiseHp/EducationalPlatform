package com.hp.bean;

public class Main {
    private Integer mNum;

    private String mName;

    private String mUrl;

    private String mImage;

    private Integer mFather;

    public Integer getmNum() {
        return mNum;
    }

    public void setmNum(Integer mNum) {
        this.mNum = mNum;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl == null ? null : mUrl.trim();
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage == null ? null : mImage.trim();
    }

    public Integer getmFather() {
        return mFather;
    }

    public void setmFather(Integer mFather) {
        this.mFather = mFather;
    }
}