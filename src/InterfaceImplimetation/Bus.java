package InterfaceImplimetation;

public class Bus implements Vehicle{


    @Override
    public void start() {
        System.out.println("Bus start with keys.......");

    }

    @Override
    public void stop() {
        System.out.println("Bus stop pressing break......");

    }

    @Override
    public void speed() {
        System.out.println("Bus top speed 70km/h");

    }

    @Override
    public void model() {
        System.out.println("Bus is 2026");

    }

    @Override
    public void tankCapacity() {
        System.out.println("Bus tankCapacity is 300l");

    }
}
