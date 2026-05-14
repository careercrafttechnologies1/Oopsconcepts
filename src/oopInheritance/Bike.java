package oopInheritance;

public class Bike extends vehicle {
    public int seat;
    public int tankCapacity;

    public Bike(String name, int price, int seat, int tankCapacity) {
        super(name, price);
        this.seat = seat;
        this.tankCapacity = tankCapacity;
    }

    public int getSeat() {
        return seat;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void displayDetails() {
        super.displayDetails();

        System.out.println("Bike seat"+seat);
        System.out.println("bike tankCapacity"+tankCapacity);
    }
}

