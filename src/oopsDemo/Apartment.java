package oopsDemo;

public class Apartment  extends Property{
    private int floor;
    private boolean haslift;

//    public Apartment(String location, double price, int size, int floor) {
//        super(location, price, size);
//        this.floor = floor;
//    }

    public Apartment(String location, double price, int size, int floor,
                     boolean hasLift){
        super(location, price, size );
        this.floor=floor;
        this.haslift=hasLift;

    }

    @Override
    public void displayDetails() {
super.displayDetails();
        System.out.println("Floor:"+ floor);
        System.out.println("Has Lift:"+haslift);
    }
}
