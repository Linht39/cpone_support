package com.lanqiao.bean;

/**
 * @auther Linht
 * @date 2018/9/14 20:58
 */
public class AdvCategory {

    private int categoryId;
    private String categoryName;
    private String categoryAlias;
    private String categoryKeyword;
    private String categoryDescription;
    private long categoryNum;

    public AdvCategory() {
    }

    public AdvCategory(String categoryName, String categoryAlias, String categoryKeyword, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryAlias = categoryAlias;
        this.categoryKeyword = categoryKeyword;
        this.categoryDescription = categoryDescription;
    }

    public AdvCategory(int categoryId, String categoryName, String categoryAlias, String categoryKeyword, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryAlias = categoryAlias;
        this.categoryKeyword = categoryKeyword;
        this.categoryDescription = categoryDescription;
    }

    public AdvCategory(int categoryId, String categoryName, String categoryAlias, String categoryKeyword, String categoryDescription, long categoryNum) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryAlias = categoryAlias;
        this.categoryKeyword = categoryKeyword;
        this.categoryDescription = categoryDescription;
        this.categoryNum = categoryNum;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryAlias() {
        return categoryAlias;
    }

    public void setCategoryAlias(String categoryAlias) {
        this.categoryAlias = categoryAlias;
    }

    public String getCategoryKeyword() {
        return categoryKeyword;
    }

    public void setCategoryKeyword(String categoryKeyword) {
        this.categoryKeyword = categoryKeyword;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public long getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(long categoryNum) {
        this.categoryNum = categoryNum;
    }

    @Override
    public String toString() {
        return "AdvCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryAlias='" + categoryAlias + '\'' +
                ", categoryKeyword='" + categoryKeyword + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                ", categoryNum=" + categoryNum +
                '}';
    }
}
