package Assigment1A;

public class OrderClass {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

    // Constructor that initializes the order with no items and a total amount of 0.0
    public OrderClass(){
        this.item1 = null;
        this.item2 = null;
        this.item3 = null;
        this.totalAmount = 0.0;
    }
    // Methods to add items to the order
    public void addItem1(MenuItem item){
        this.item1 = item;
    }
    public void addItem2(MenuItem item){
        this.item2 = item;
    }
    public void addItem3(MenuItem item){
        this.item3 = item;
    }
    //Method to calculate the total of the order
    public void calculateTotal(){
        totalAmount = 0.0;
        if (item1 != null) totalAmount += item1.getPrice();
        if (item2 != null) totalAmount += item2.getPrice();
        if (item3 != null) totalAmount += item3.getPrice();
    }
    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        if (item1 != null) item1.displayItemInfo();
        if (item2 != null) item2.displayItemInfo();
        if (item3 != null) item3.displayItemInfo();
        System.out.println("Total Amount: $" + totalAmount);
    }



}
