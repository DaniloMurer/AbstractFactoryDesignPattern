package com.danilojakob.designpattern.util.helper;

import com.danilojakob.designpattern.category.Category;
import com.danilojakob.designpattern.item.Item;

import java.io.*;

public class FileHelper {

    private File file;
    private String workingDir = System.getProperty("user.dir");

    /**
     * Creates a item file
     * @param item {@link Item}
     */
    public void createItemFile(Item item) {
        file = new File(workingDir + "\\items\\item" + item.getItemName() + ".txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(item);
            ous.close();
            fos.close();
        } catch (IOException ex) {
            System.err.printf("Error while creating item file: %s", ex.toString());
        }
    }

    /**
     * Creates a category file
     * @param category {@link Category}
     */
    public void createCategoryFile(Category category) {
        file = new File(workingDir + "\\categories\\category" + category.getCategoryName() + ".txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(category);
            ous.close();
            fos.close();
        } catch (IOException ex) {
            System.err.printf("Error while creating category file: %s", ex.toString());
        }
    }

    /**
     * Method for getting an {@link Item}
     * @param itemName {@link String} name of the item
     * @return {@link Item}
     */
    public Item readItemFile(String itemName) {
        file = new File(workingDir + "\\items\\item" + itemName + ".txt");
        Item item = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            item = (Item) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.err.printf("Error while reading item: %s", ex.toString());
        }
        return item;
    }

    /**
     * Method for getting a {@link Category}
     * @param categoryName {@link String} name of the category
     * @return {@link Category}
     */
    public Category readCategoryFile(String categoryName) {
        file = new File(workingDir + "\\categories\\category" + categoryName + ".txt");
        Category category = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            category = (Category) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception ex) {
            System.err.printf("Error while reading object: %s", ex.toString());
        }
        return category;
    }
}
