package com.danilojakob.designpattern.category;

import com.danilojakob.designpattern.item.Item;
import com.danilojakob.designpattern.util.helper.FileHelper;
import java.util.Scanner;

public class CategoryManager {

    /**
     * Method for creating a category file
     */
    public void createCategory() {
        Scanner scanner = new Scanner(System.in);
        FileHelper fileHelper = new FileHelper();

        System.out.println("Kategorie erstellen....");
        System.out.println("Kategoriename: ");
        String categoryName = scanner.nextLine();

        Category category = new Category(categoryName);
        fileHelper.createCategoryFile(category);
    }

    /**
     * Method for getting a category
     * @return {@link Category}
     */
    public Category getCategory() {
        Scanner scanner = new Scanner(System.in);
        FileHelper fileHelper = new FileHelper();

        System.out.println("Kategorie lesen...");
        System.out.println("Kategoriename: ");
        String name = scanner.nextLine();

        return fileHelper.readCategoryFile(name);
    }
}
