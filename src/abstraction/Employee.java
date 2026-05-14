package abstraction;

public abstract class Employee {
    public void salary(){
        System.out.println("Employee salary");
    }
    public void workinghour(){
        System.out.println("Employee working Hour..... ");
    }

    abstract void gender();
}
