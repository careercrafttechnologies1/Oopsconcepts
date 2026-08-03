package java8;

public interface Employee {
    void work();

    // Default Method
    default void attendance(){
        System.out.println("Employee attendance");
    }

    // Static Method
    static void companyName(){
        System.out.println("Employee CompanyName : CareerCraft Technologies");
    }

}
