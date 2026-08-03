package java8.funtionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {

        //Function Interface
        Function<Integer,Integer> square = n -> n*n;
        System.out.println(square.apply(7));

        Predicate<Integer> evenOdd = n -> n % 2 == 0;
        System.out.println(evenOdd.test(5));


    }
}
