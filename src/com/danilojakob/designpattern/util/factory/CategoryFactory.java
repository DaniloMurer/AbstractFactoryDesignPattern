package com.danilojakob.designpattern.util.factory;

import com.danilojakob.designpattern.category.Category;
import com.danilojakob.designpattern.category.CategoryManager;
import com.danilojakob.designpattern.item.Item;

public class CategoryFactory extends AbstractFactory {

    @Override
    public void createCategory() {
        new CategoryManager().createCategory();
    }

    @Override
    public void createItem() {
        /* */
    }

    @Override
    public Category getCategory() {
        return new CategoryManager().getCategory();
    }

    @Override
    public Item getItem() {
        return null;
    }

}
