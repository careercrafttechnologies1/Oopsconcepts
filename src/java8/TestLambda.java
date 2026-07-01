package java8;

public class TestLambda {
    public static void main(String[] args) {
        Message msg = () ->{
            System.out.println("Welcome to java 8");
        };
        msg.display();
    }
}
