package oopExample;

public class Car extends Vechicles{
    private int  wheel;

    public Car(String brand, int speed, double price, int wheel){
        super(brand, speed, price);
        this.wheel=wheel;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("wheels:"+wheel);
    }
}
