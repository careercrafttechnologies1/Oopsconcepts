package streamAPI;

public class Employee1 {
    String name;
    int Id;
    int salary;
    String address;

    public Employee1(String name, int id, int salary, String address) {
        this.name = name;
        Id = id;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
