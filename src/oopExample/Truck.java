package oopExample;

public class Truck extends Vechicles {
    private int loadcapacity;  //kg

    public Truck(String brand, int speed, double price, int loadcapacity){
        super(brand,speed,price);
        this.loadcapacity=loadcapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("loadcapacity:"+loadcapacity);
    }
}
