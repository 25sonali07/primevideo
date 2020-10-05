package com.example.primevideoclone.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllCategory {

    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("categoryTitle")
    @Expose
    private String categoryTitle;
    @SerializedName("categoryItemList")
    @Expose
    private List<CategoryItemList> categoryItemList = null;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<CategoryItemList> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItemList> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }

}


































//package com.example.primevideoclone.model;
//
//import android.content.Intent;
//
//import java.util.List;
//
//public class AllCategory {
//
//    String categoryTitle;
//    Integer categoryId;
//    private List<CategoryItem>categoryItemList= null;
//
//    public AllCategory( Integer categoryId,String categoryTitle, List<CategoryItem> categoryItemList) {
//        this.categoryTitle = categoryTitle;
//        this.categoryId = categoryId;
//        this.categoryItemList = categoryItemList;
//    }
//
//    public List<CategoryItem> getCategoryItemList() {
//        return categoryItemList;
//    }
//
//    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
//        this.categoryItemList = categoryItemList;
//    }
//
//    public String getCategoryTitle() {
//        return categoryTitle;
//    }
//
//    public void setCategoryTitle(String categoryTitle) {
//        this.categoryTitle = categoryTitle;
//    }
//
//    public Integer getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(Integer categoryId) {
//        this.categoryId = categoryId;
//    }
//}
