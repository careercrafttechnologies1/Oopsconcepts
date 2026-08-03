package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberFilterUsingStream {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(12, 14, 45, 23, 44, 78, 41, 40, 25, 44);


        // Example 1: Filter specific numbers (45, 44, 41, 40)

        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num == 45 || num == 44 || num == 41 || num == 40)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Filtered Numbers : " + filteredNumbers);

        // Example 2: Filter numbers greater than 25

        List<Integer> greaterThan25 = numbers.stream()
                .filter(num -> num > 25)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Numbers Greater Than 25 : " + greaterThan25);


        // Example 3: Find even numbers and print their squares
        List<Integer> evenSquares = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Squares of Even Numbers : " + evenSquares);

        // Example 4: Find squares of all numbers

        List<Integer> squareNumbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Squares of All Numbers : " + squareNumbers);

        // Example 5: Find ODD number

        List<Integer> oddNumber = numbers.stream()
                .filter( num -> num % 2 !=0)
                .collect(Collectors.toList());
        System.out.println("ODD Number : " + oddNumber);
    }
}
