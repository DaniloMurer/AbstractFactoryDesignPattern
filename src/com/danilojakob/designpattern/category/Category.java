package com.danilojakob.designpattern.category;

import java.io.Serializable;

public class Category implements Serializable {

    private String categoryName;

    public Category() {}

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
