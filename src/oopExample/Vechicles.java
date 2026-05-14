package oopExample;

public class Vechicles {
    private String brand;
    private int speed;
    private double price;

    public Vechicles(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

//    public Vechicles(String brand, int speed, double price) {
//    }

        public String getBrand () {
            return brand;
        }

        public int getSpeed () {
            return speed;
        }

        public double getPrice () {
            return price;
        }

        public void displayDetails()

    {
        System.out.println("Brand is:"+ brand);
        System.out.println(" Top Speed:"+  speed);
        System.out.println("Price:"+price);
    }
    }

