package methodOverriding;

public class Test {
    public static void main(String[] args) {

        // Vechicles vechicles=new Vechicles();
        Bike bike = new Bike();
        Car car = new Car();
        Bus bus = new Bus();
        Truck truck = new Truck();
        bike.horn();
        car.horn();
        bus.horn();
        truck.horn();

    }

}
