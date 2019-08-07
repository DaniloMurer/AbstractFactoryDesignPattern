package com.danilojakob.designpattern.util.helper;

import com.danilojakob.designpattern.util.FactoryType;
import com.danilojakob.designpattern.util.factory.AbstractFactory;
import com.danilojakob.designpattern.util.factory.CategoryFactory;
import com.danilojakob.designpattern.util.factory.ItemFactory;

/**
 * Class for getting factories
 */
public class FactoryHelper {

    /**
     * Method for getting corresponding factories
     * @param type {@link String} Type of factory
     * @return {@link AbstractFactory} the factory
     */
    public static AbstractFactory getFactory(FactoryType type) {
        if (type == FactoryType.ITEM) {
            return new ItemFactory();
        } else if (type == FactoryType.CATEGORY) {
            return new CategoryFactory();
        }
        return null;
    }
}
