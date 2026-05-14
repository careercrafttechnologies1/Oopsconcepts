package oopsDemo;

public class House extends  Property{
    private int room;
    private  boolean hasGardern;

//    public House(String location, double price, int size, boolean hasGardern) {
//        super(location, price, size);
//        this.hasGardern = hasGardern;
//    }

    public House(String location, double price, int size, int room, boolean b) {
        super(location, price, size);
        this.room = room;
        this.hasGardern = hasGardern;
    }

//    public House(String loction, double price, int size, int room, boolean hasGardern) {
//        super.(loction, price,size);
//        this.room=rooms;
//        this.hasGardern=hasGardern;
//
//    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Rooms:"+room);
        System.out.println("HasGardern:"+ hasGardern);
    }
}
