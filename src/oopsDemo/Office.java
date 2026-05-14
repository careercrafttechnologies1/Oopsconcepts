package oopsDemo;

public class Office extends Property{
    private int cabins;
    private boolean cabs;


   public Office(String location, double price, int size, int cabins, boolean cabs) {


       super(location, price, size);
       this.cabins=cabins;
       this.cabs=cabs;
   }
     public void displayDetails() {
       super.displayDetails();
         System.out.println("number od cabins:" + cabins);
         System.out.println("cabs:" + cabs);
     }
}