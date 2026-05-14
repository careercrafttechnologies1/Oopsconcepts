package oopExample;

public class Bus extends Vechicles{
    private int seats;

    public Bus(String brand, int speed, double price, int seats){
        super(brand,speed,price);
        this.seats=seats;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("How many seats:"+ seats);
    }
}
