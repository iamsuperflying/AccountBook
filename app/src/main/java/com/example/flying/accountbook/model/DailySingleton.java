package com.example.flying.accountbook.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by flying on 2017/11/24.
 */

public class DailySingleton {

    private static DailySingleton sDailySingleton;

    private List<Daily> mDailies;
    private List<CatalogItem> mCatalogItems;

    public static DailySingleton getDailySingleton(Context context) {

        if (sDailySingleton == null) {
            sDailySingleton = new DailySingleton(context);
        }

        return sDailySingleton;
    }

    public DailySingleton(Context context) {

        mDailies = new ArrayList<>();
        mCatalogItems = new ArrayList<>();

    }

    public List<Daily> getDailies() {

        if (mDailies.size() == 0) {

            List<Daily> dailies = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Daily daily = new Daily();
                daily.setCategory("餐饮");
                daily.setDate(new Date());
                daily.setPrice("11.35");
                dailies.add(daily);
            }

            mDailies = dailies;
        }
        return mDailies;
    }

    public void setDailies(List<Daily> dailies) {
        mDailies = dailies;
    }

    public List<CatalogItem> getCatalogItems() {

        if (mCatalogItems.size() == 0) {

            List<CatalogItem> catalogItems = new ArrayList<>();

            for (int i = 0; i < 18; i ++) {
                CatalogItem catalogItem = new CatalogItem();
                catalogItem.setCatalogName("餐饮" + i);
                catalogItems.add(catalogItem);
            }

            mCatalogItems = catalogItems;

        }

        return mCatalogItems;
    }

    public void setCatalogItems(List<CatalogItem> catalogItems) {
        mCatalogItems = catalogItems;
    }
}
