package com.example.shashank.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shashank on 26-06-2017.
 */

public class ItemModel {

    @SerializedName("prdname")
    private String name;

    @SerializedName("mrp")
    private String mrp;

    @SerializedName("sellingprice")
    private String sellingPrice;

    @SerializedName("catg")
    private String category;

    @SerializedName("subcatg")
    private String subCategory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMrp() {
        return mrp;
    }

    public void setMrp(String mrp) {
        this.mrp = mrp;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
}
