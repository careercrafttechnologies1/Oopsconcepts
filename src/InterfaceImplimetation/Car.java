package InterfaceImplimetation;

public class Car implements Vehicle {


    @Override
    public void start() {
        System.out.println("Car start with key...");

    }

    @Override
    public void stop() {
        System.out.println("Car stop using break");

    }

    @Override
    public void speed() {
        System.out.println("Car increase speed");

    }

    @Override
    public void model() {
        System.out.println("Car model is honda");

    }

    @Override
    public void tankCapacity() {
        System.out.println("Car tankCapacity is 100l");

    }
}
