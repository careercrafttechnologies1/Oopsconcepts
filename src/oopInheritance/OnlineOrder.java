package oopInheritance;

public class OnlineOrder {
    String customerName;
    int orderId;
    String platform;
    String itemName;
    double price;

    public OnlineOrder(String customerName, int orderId, String platform, String itemName, double price) {
        this.customerName = customerName;
        this.orderId = orderId;
        this.platform = platform;
        this.itemName = this.itemName;
        this.price = price;

    }

    public String getCustomerName() {
        return customerName;
    }

    public int getOrderId(){
        return orderId;
    }

    public String getPlatform(){
        return platform;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails(){
        System.out.println("----- Order Details -----");
        System.out.println("Platform: " + platform);
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
    }
    }

