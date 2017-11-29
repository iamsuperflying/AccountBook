package com.example.flying.accountbook.model;

import java.util.Date;

/**
 * Created by flying on 2017/11/24.
 */

public class Daily {

    /**
     * 日期
     */
    private Date mDate;

    /**
     * 价格
     */
    private String mPrice;

    /**
     * 类别
     */
    private String mCategory;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }
}
