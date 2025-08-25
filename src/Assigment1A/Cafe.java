package Assigment1A;

public class Cafe {
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private OrderClass order;

    //Constructor that is initializing the menu and order with null.
    public Cafe() {
        this.menuItem1 = null;
        this.menuItem2 = null;
        this.menuItem3 = null;
        this.order = null;
    }
    //Methods to add the menu items
    public void addMenuItem1(MenuItem item) {
        this.menuItem1 = item;
    }

    public void addMenuItem2(MenuItem item) {
        this.menuItem2 = item;

    }

    public void addMenuItem3(MenuItem item) {
        this.menuItem3 = item;
    }
    //Method to place order and calculate total
    public void placeOrder(OrderClass order) {
        this.order = order;
        this.order.calculateTotal();
    }
    //Method to display the menu
    public void displayMenu() {
        System.out.println("Cafe Menu:");
        if (menuItem1 != null) menuItem1.displayItemInfo();
        if (menuItem2 != null) menuItem2.displayItemInfo();
        if (menuItem3 != null) menuItem3.displayItemInfo();
    }
}



