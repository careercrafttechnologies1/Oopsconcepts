package abstraction;

public class Car extends Vehicle{

    @Override
    void horn() {
        System.out.println("Car horn is po po poo po.......");

    }

    @Override
    void mileage() {
        System.out.println("Car mileage is 15 km");

    }
}
