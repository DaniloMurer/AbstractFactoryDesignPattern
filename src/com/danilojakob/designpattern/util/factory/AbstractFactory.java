package com.danilojakob.designpattern.util.factory;

import com.danilojakob.designpattern.category.Category;
import com.danilojakob.designpattern.item.Item;

public abstract class AbstractFactory {
    /**
     * Method for creating a {@link Category}
     */
    public abstract void createCategory();

    /**
     * Method for getting {@link Category}
     * @return {@link Category}
     */
    public abstract Category getCategory();

    /**
     * Method for getting a {@link Item}
     */
    public abstract void createItem();

    /**
     * Method for getting {@link Item}
     * @return {@link Item}
     */
    public abstract Item getItem();

    public Class getType() {
        return this.getClass();
    }
}
