package com.danilojakob.designpattern.item;

import com.danilojakob.designpattern.category.Category;

import java.io.Serializable;

public class Item implements Serializable {

    private String itemName;
    private Category category;
    private boolean isDangerous;

    public Item() {}

    public Item(String itemName, Category category, boolean isDangerous) {
        this.itemName = itemName;
        this.category = category;
        this.isDangerous = isDangerous;
    }

    public String getItemName() {
        return itemName;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isDangerous() {
        return isDangerous;
    }
}

