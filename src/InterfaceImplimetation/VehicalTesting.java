package InterfaceImplimetation;

//import abstraction.Car;

public class VehicalTesting {
    public static void main(String[] args) {

        Car car = new Car();
        car.speed();
        car.start();
        car.stop();
        car.model();
        car.tankCapacity();

        Bike bike = new Bike();

        bike.model();
        bike.start();
        bike.stop();
        bike.tankCapacity();
        bike.speed();


        Truck truck = new Truck();
        truck.model();
        truck.speed();
        truck.start();
        truck.stop();
        truck.tankCapacity();

        Bus bus = new Bus();


        bus.model();
        bus.speed();
        bus.start();
        bus.stop();
        bus.tankCapacity();
    }
}
