package streamAPI;

public class Employee {
//    properties
        int id;
        String name;
        double salary;
        String address;
        String department;
// constructor
        public Employee(  int id, String name, double salary, String address, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.address = address;
            this.department = department;
        }
  // to String method
            public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        ", address='" + address + '\'' +
                        ", department='" + department + '\'' +
                        '}';
        }
    }

