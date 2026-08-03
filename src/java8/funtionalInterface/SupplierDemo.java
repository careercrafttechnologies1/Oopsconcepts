package java8.funtionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<String> msg = ()-> "Welcome to java 8.";

        System.out.println(msg.get());


        Supplier<Integer> msg1 = ()-> 7777;
        System.out.println(msg1.get());
    }
}
