package com.example.flying.accountbook.model;

/**
 * Created by flying on 2017/11/28.
 */

public class CatalogItem {

    private int id;

    /*
     * 图片名称
     */
    private String imageName;

    /*
     * 分类名称
     */
    private String catalogName;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}
