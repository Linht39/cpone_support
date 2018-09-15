package com.lanqiao.bean;

import java.util.Date;

/**
 * @auther Linht
 * @date 2018/9/14 18:51
 */
public class Advertisement {

    private int advId;          //id
    private String advName;     //名称
    private String advText;     //文本
    private long advViews;      //浏览量
    private Date advTime;       //时间
    private String advKeyword;  //关键字
    private String advDescription;  //描述
    private int categoryId;     //分类id

    public Advertisement() {
    }

    public Advertisement(int advId) {
        this.advId = advId;
    }

    public Advertisement(String advName, String advText, String advKeyword, String advDescription, int categoryId) {
        this.advName = advName;
        this.advText = advText;
        this.advKeyword = advKeyword;
        this.advDescription = advDescription;
        this.categoryId = categoryId;
    }

    public Advertisement(int advId, String advName, String advText, long advViews, Date advTime, String advKeyword, String advDescription, int categoryId) {
        this.advId = advId;
        this.advName = advName;
        this.advText = advText;
        this.advViews = advViews;
        this.advTime = advTime;
        this.advKeyword = advKeyword;
        this.advDescription = advDescription;
        this.categoryId = categoryId;
    }

    public int getAdvId() {
        return advId;
    }

    public void setAdvId(int advId) {
        this.advId = advId;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    public String getAdvText() {
        return advText;
    }

    public void setAdvText(String advText) {
        this.advText = advText;
    }

    public long getAdvViews() {
        return advViews;
    }

    public void setAdvViews(long advViews) {
        this.advViews = advViews;
    }

    public Date getAdvTime() {
        return advTime;
    }

    public void setAdvTime(Date advTime) {
        this.advTime = advTime;
    }

    public String getAdvKeyword() {
        return advKeyword;
    }

    public void setAdvKeyword(String advKeyword) {
        this.advKeyword = advKeyword;
    }

    public String getAdvDescription() {
        return advDescription;
    }

    public void setAdvDescription(String advDescription) {
        this.advDescription = advDescription;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advId=" + advId +
                ", advName='" + advName + '\'' +
                ", advText='" + advText + '\'' +
                ", advViews=" + advViews +
                ", advTime=" + advTime +
                ", advKeyword='" + advKeyword + '\'' +
                ", advDescription='" + advDescription + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
