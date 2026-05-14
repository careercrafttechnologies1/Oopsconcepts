package encapsulation;

public class TestStudent {
    public static void main(String[] args) {

        Student S = new Student("Sourav", 21);


        S.getname();
        S.getAge();

        System.out.println(S.getname());
        System.out.println(S.getAge());



    }
}
