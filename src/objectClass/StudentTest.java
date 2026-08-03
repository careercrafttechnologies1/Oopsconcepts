package objectClass;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
       Student s2 = new Student(101, "Rahul");

        System.out.println(s1.equals(s2));


    }
}
