package InterfaceImplimetation;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck start using key");

    }

    @Override
    public void stop() {
        System.out.println("Truck stop using breaks");

    }

    @Override
    public void speed() {
        System.out.println("Truck maximum speed is 80km/h");

    }

    @Override
    public void model() {
        System.out.println("Truck model is 2025");

    }

    @Override
    public void tankCapacity() {
        System.out.println("Truck tankCapacity is 500l");

    }
}
