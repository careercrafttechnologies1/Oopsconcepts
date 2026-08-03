package java8.funtionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> lengthFunction = str -> str.length();

        int result = lengthFunction.apply("JavaProgramming" + "Python");
        System.out.println(result);

        Function<String, String> upperCase = str -> str.toUpperCase();
        System.out.println(upperCase.apply("java"));

        Function<Integer,Integer> square = num-> num*num;
        System.out.println(square.apply(4));
    }
}
