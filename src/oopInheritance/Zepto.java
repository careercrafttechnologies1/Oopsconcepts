package oopInheritance;

public class Zepto extends OnlineOrder{
    public int deliveryTime;

    public Zepto(String customerName, int orderId, String platform, String itemName, double price, int deliveryTime) {
        this.deliveryTime=deliveryTime;
        super(customerName, orderId, platform, itemName, price);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("deliveryTime = "+ deliveryTime);
    }
}
