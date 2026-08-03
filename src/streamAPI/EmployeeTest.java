package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Aditya", 45000, "Modinagar", "Development"),
                new Employee(102, "Dhruv", 60000, "Delhi", "AI/ML"),
                new Employee(103, "Ankit", 120000, "Ghaziabad", "DevOps"),
                new Employee(104, "Vishal", 80000, "Shastri Nagar", "Development"),
                new Employee(105, "Rohit", 55000, "Noida", "Testing"),
                new Employee(106, "Aman", 70000, "Meerut", "Development"),
                new Employee(107, "Nitin", 35000, "Lucknow", "Support"),
                new Employee(108, "Sourav", 90000, "Gurgaon", "AI/ML"),
                new Employee(109, "Karan", 40000, "Faridabad", "HR"),
                new Employee(110, "Priya", 65000, "Pune", "DevOps")
        );
//                List<Employee> collect = employees.stream()
//                  .filter(x -> x.salary > 50000)
//                  .collect(Collectors.toList());
         // System.out.println(collect);
        employees.stream().filter(x->x.salary>70000).forEach(System.out::println);

        long developmentCount = employees.stream().filter(x-> x.department.equals("Development")).count();

        System.out.println("Number of employees in Development department: " + developmentCount);
    }
}
