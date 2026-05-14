package InterfaceImplimetation;

public class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bike starts with key");

    }

    @Override
    public void stop() {
        System.out.println("Bike stop using breaks");

    }

    @Override
    public void speed() {
        System.out.println("bike maximum speed is 140");

    }

    @Override
    public void model() {
        System.out.println("Bike model is TVS");

    }

    @Override
    public void tankCapacity() {
        System.out.println("bike tankCapacity is 10l");

    }
}
