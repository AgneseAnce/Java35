package tasks.grocery;

import java.util.Scanner;

public class Main {
    // Declare Scanner
    private static Scanner scanner = new Scanner(System.in);
    // Main object
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit){

            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    // print all options
                    printInstructions();
                    break;
                case 1:
                    // print grocery list
                    groceryList.printGroceryList();
                    break;
                case 2:
                    // add item
                    addItem();
                    break;
                case 3:
//                    groceryList.modifyGroceryItem();
                    // modify item
                    break;
                case 4:
//                    groceryList.removeGroceryItem();
                    // remove item
                    break;
                case 5:

                    // search item
                    break;
                case 6:
//                    groceryList.deleteAllItems();
                    // delete everything
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    private static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all item in the list");
        System.out.println("\t 7 - To quit the application");
    }

    private static void addItem(){
        System.out.println("Please enter the grocery item you want to add");
        groceryList.addGroceryItem(scanner.nextLine());
    }
}

