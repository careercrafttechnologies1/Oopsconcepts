package oopExample;

public class test {
    public static void main(String[] args) {
//        Bike bike=new Bike("honda",120,120000,40,"sports");
//        {
//            bike.displayDetails();
//        }

        Car car=new Car("Fortuner",180,3500000,4);
        {
            car.displayDetails();
        }

        Bus bus=new Bus("Tata", 120,5000000,50);
        {
            bus.displayDetails();
        }

        Truck truck=new Truck("Ashok Leyland", 100,6000000,10000);
        {
            truck.displayDetails();
        }
    }
}
