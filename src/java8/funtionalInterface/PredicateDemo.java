package java8.funtionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> evenOdd = n -> n % 2 == 0 ;
        System.out.println(evenOdd.test(20));
    }
}
