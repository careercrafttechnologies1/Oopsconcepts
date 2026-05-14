package methodOverriding;

public class Bike extends Vechicles {
    @Override
    public void horn() {
        super.horn();
        System.out.println(" Bike is pi pi.....");
    }
}

