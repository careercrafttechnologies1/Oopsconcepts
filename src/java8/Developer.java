package java8;

public class Developer implements Employee {


    @Override
    public void work() {
        System.out.println("Developer Write a code");
    }

    @Override
     public void attendance(){
        System.out.println("Developers make attendance");
    }
}
