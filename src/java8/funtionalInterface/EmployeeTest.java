package java8.funtionalInterface;

import java.util.function.Function;

public class EmployeeTest {
    public static void main(String[] args) {

        Function<Employee, Integer> getSalary = emp -> emp.salary;

        Employee e = new Employee("Rahul", 50000);

        System.out.println(getSalary.apply(e));
    }
}
