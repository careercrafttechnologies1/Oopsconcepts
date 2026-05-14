package oopInheritance;

public class vehicle {
    public String name;
    public double price;

    public vehicle(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Vehicle name" + name);
        System.out.println("double price" + price);

    }
}
