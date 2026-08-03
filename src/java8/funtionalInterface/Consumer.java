package java8.funtionalInterface;

public class Consumer {
    public static void main(String[] args) {


        java.util.function.Consumer<String> print = Name-> System.out.println("Hello " + Name);
        print.accept("Sourav");
    }
}
