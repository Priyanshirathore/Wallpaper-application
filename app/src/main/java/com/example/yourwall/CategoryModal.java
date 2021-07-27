package com.example.yourwall;

import android.graphics.Paint;

import java.util.PrimitiveIterator;

public class CategoryModal {
    private String category;
    private String imgURL;

    public CategoryModal(String category, String imgURL)
    {
        this.category=category;
        this.imgURL=imgURL;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getCategory() {
        return category;
    }

    public String getImgURL() {
        return imgURL;
    }
}
