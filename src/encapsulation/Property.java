package encapsulation;

public class Property {
    private String location;
    private int size;
    private  double price;


    public Property(String location, int size, double price){
        this.location=location;
        this.size=size;
        this.price=price;
    }

    public Property() {
    }
    public String getLocation(){
        return location;
    }
    public int getSize(){
        return size;
    }
    public double getPrice(){
        return price;
    }

    public void setLocation(){
        this.location=location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


