package Assigment1A;

public class MenuItem {
    private String name;
    private double price;
    private String category;

    // Constructor
    public MenuItem(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }
    // Getters and Setters
    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display info
    public void displayItemInfo() {
        System.out.println("Name: " + name + ", Price: $" + price + ", Category: " + category);

    }
}