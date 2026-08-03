package java8;

public class OneParameterTest {
    public static void main(String[] args) {
    OneParameter oneParameter =    (number)-> {
        System.out.println(number * number);
        return number;
    };
    oneParameter.Square(7);
    }
}
