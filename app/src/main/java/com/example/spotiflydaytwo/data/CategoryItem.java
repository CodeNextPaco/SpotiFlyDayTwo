package com.example.spotiflydaytwo.data;

public class CategoryItem {

    private String catetoryText;
    private String categoryType;
    private int resourceID;


    //two constructors, one for all the items, one with only categoryText and Type, no drawable.
    public CategoryItem(String catetoryText,  String categoryType, int resourceID) {
        this.catetoryText = catetoryText;
        this.categoryType = categoryType;
        this.resourceID = resourceID;
    }

    public CategoryItem(String catetoryText, String categoryType) {
        this.catetoryText = catetoryText;
        this.categoryType = categoryType;
    }

    public String getCatetoryText() {
        return catetoryText;
    }

    public void setCatetoryText(String catetoryText) {
        this.catetoryText = catetoryText;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }
}
