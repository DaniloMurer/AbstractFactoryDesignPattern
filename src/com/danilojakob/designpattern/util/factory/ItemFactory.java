package com.danilojakob.designpattern.util.factory;

import com.danilojakob.designpattern.category.Category;
import com.danilojakob.designpattern.item.Item;
import com.danilojakob.designpattern.item.ItemManager;

public class ItemFactory extends AbstractFactory {

    @Override
    public void createCategory() {
        /* */
    }

    @Override
    public void createItem() {
        new ItemManager().createItem();
    }

    @Override
    public Category getCategory() {
        return null;
    }

    @Override
    public Item getItem() {
        return new ItemManager().getItem();
    }
}
