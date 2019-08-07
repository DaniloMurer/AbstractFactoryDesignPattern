package com.danilojakob.designpattern.item;

import com.danilojakob.designpattern.category.Category;
import com.danilojakob.designpattern.util.helper.FileHelper;
import java.util.Scanner;

public class ItemManager {

    /**
     * Method for creating an Item file
     */
    public void createItem() {
        Scanner scanner = new Scanner(System.in);
        FileHelper fileHelper = new FileHelper();

        System.out.println("Item erstellen....");
        System.out.println("Namen des items:");
        String itemName = scanner.nextLine();
        System.out.println("Ist das Item gefährlich: true/false");
        boolean isDangerous = Boolean.valueOf(scanner.nextLine());
        System.out.println("Kategoriename: ");
        String categoryName = scanner.nextLine();
        Category category = fileHelper.readCategoryFile(categoryName);

        Item item = new Item(itemName, category, isDangerous);
        fileHelper.createItemFile(item);
    }

    /**
     * Method for getting an {@link Item}
     * @return {@link Item}
     */
    public Item getItem() {
        Scanner scanner = new Scanner(System.in);
        FileHelper fileHelper = new FileHelper();

        System.out.println("Item lesen...");
        System.out.println("Name des items: ");
        String name = scanner.nextLine();

        return fileHelper.readItemFile(name);
    }
}
