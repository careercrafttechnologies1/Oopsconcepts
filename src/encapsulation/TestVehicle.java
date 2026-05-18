package encapsulation;

public class TestVehicle {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Yellow", 1200000, 2019);

        v.getcolour();
        v.getprice();
        v.getmanufactureYear();

        System.out.println("Vehicle Colour is " + v.getcolour());
        System.out.println("Vehicle Price is " + v.getprice());
        System.out.println("Vehicle ManuFactureYear "+ v.getmanufactureYear());

    }
}
