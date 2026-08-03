package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Employee1Test {
    public static void main(String[] args) {

        List<Employee1> list = Arrays.asList(
                new Employee1("Sourav",7,70000,"sahibabad"),
                new Employee1("Dhruv",8,60000,"delhi"),
                new Employee1("Pawan",9,76600,"New Delhi"),
                new Employee1("Payal",10,40000,"GZB"),
                new Employee1("Piyush",11,34400,"Mohan Nagar"),
                new Employee1("Mayak",12,30000,"GZB")
        );
        list.stream().filter(x-> x.salary>10000 && x.getName().startsWith("P")).forEach(System.out::println);

    }

}
