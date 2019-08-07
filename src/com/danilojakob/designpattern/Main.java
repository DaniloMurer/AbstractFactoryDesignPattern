package com.danilojakob.designpattern;

import com.danilojakob.designpattern.item.Item;
import com.danilojakob.designpattern.util.FactoryType;
import com.danilojakob.designpattern.util.factory.AbstractFactory;
import com.danilojakob.designpattern.util.helper.FactoryHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractFactory factory;
        System.out.println("Was willst du machen?");
        String readWrite = scanner.nextLine();

        if (readWrite.equalsIgnoreCase("lesen")) {
            System.out.println("Was willst du lesen?");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("item")) {
                factory = FactoryHelper.getFactory(FactoryType.ITEM);
                Item item = factory.getItem();
                System.out.printf("Itemname: %s%nGefährlich: %s%nKategorie: %s", item.getItemName(), item.isDangerous(), item.getCategory().getCategoryName());
            } else if (type.equalsIgnoreCase("category")) {
                factory = FactoryHelper.getFactory(FactoryType.CATEGORY);
                factory.getCategory();
            } else {
                System.out.println("Diese Auswahl existiert leider nicht");
            }
        } else if (readWrite.equalsIgnoreCase("erstellen")){
            System.out.println("Was willst du erstellen?");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("item")) {
                factory = FactoryHelper.getFactory(FactoryType.ITEM);
                factory.createItem();
            } else if (type.equalsIgnoreCase("category")) {
                factory = FactoryHelper.getFactory(FactoryType.CATEGORY);
                factory.createCategory();
            } else {
                System.out.println("Diese Auswahl existiert leider nicht");
            }
        }
    }
}
