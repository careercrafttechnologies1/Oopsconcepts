package encapsulation;

public class Vehicle {
    public String colour;
    public int price;
    public int manufactureYear;

    Vehicle(String colour, int price, int manufactureYear) {
        this.colour = colour;
        this.price = price;
        this.manufactureYear = manufactureYear;
    }

    public String getcolour() {
        return colour;
    }

    public void Setcolour(String colour) {
        this.colour = colour;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {

        if (price >= 0) {

            this.price = price;
        }
        }
        public int getmanufactureYear() {
            return manufactureYear;
        }
        public void setManufactureYear(int manufactureYear){
            this.manufactureYear = manufactureYear;
        }
    }

