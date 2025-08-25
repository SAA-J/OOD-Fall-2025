package Assigment1A;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        // Create a cafe() and add menu items
        Cafe cafe = new Cafe();
        MenuItem item1 = new MenuItem("Beverage", "Capuccino", 3.0);
        MenuItem item2 = new MenuItem("Food", "Ham Sandwich", 5.50);
        MenuItem item3 = new MenuItem("Dessert", "Apple Pie", 4.0);
        // Add items to cafe menu
        cafe.addMenuItem1(item1);
        cafe.addMenuItem2(item2);
        cafe.addMenuItem3(item3);
        System.out.println("Menu: ");

        // Display the menu
        cafe.displayMenu();
        Scanner scnr = new Scanner(System.in);
        // Takes user order
        OrderClass order = new OrderClass();
        System.out.println("\nPlace your order (Enter item numbers 1, 2, or 3; Enter 0 to finish):");
        // This loops until user enters 0, adding items to the order.
        while (true) {
            System.out.print("Enter item number: ");
            int choice = scnr.nextInt();
            if (choice == 0) break;
            switch (choice) {
                case 1: // Add item1 to order
                    order.addItem1(item1);
                    break;
                case 2: // Add item2 to order
                    order.addItem2(item2);
                    break;
                case 3: // Add item3 to order
                    order.addItem3(item3);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        // Place the order and display details
        cafe.placeOrder(order);
        order.displayOrderDetails();

        scnr.close();
    }
}



