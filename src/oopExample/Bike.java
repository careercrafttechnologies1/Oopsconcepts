package oopExample;

public class Bike extends Vechicles{
    private double mileage;
    private String type;

    public Bike( String brand, int speed, double price, double mileage, String type){
        super(brand,speed,price);
        this.mileage=mileage;
        this.type=type;
    }
    public void displayDetails() {

        super.displayDetails();
        System.out.println("mileage:"+mileage);
        System.out.println("type is:"+type);
    }
}
