package abstraction;

public abstract class Vehicle {
    public void speed(){
        System.out.println("Vehicle speed.....");
    }

    public void wheel(){
        System.out.println("Vehicles run on wheels...");
    }

    abstract void horn();
    abstract void mileage();

}
