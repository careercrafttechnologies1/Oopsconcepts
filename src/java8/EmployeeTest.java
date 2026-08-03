package java8;

public class EmployeeTest {
    public static void main(String[] args) {

        Workers workers = new Workers();
        Developer developer = new Developer();
        CEO ceo = new CEO();

        workers.work();
        ceo.work();
        developer.work();
        developer.attendance();
        Employee.companyName();
    }
}
