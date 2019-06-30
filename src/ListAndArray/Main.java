package ListAndArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        int choice=0;
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1- to print the list of grocery items");
        System.out.println("\t 2- To add an item to the list");
        System.out.println("\t 3- To modify and item in the list");
        System.out.println("\t 4- To remove an item from the list");
        System.out.println("\t 5- to search for an item in the list");
        System.out.println("\t 6 - To quit the application ");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current Item Name: ");
        String itemNo = sc.nextLine();
        sc.nextLine(); //clearing the buffer
        System.out.println("Enter replacement item: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryList(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        String itemNo = sc.nextLine();
        sc.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = sc.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();

        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> newArray2 = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
