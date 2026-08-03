package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        boolean result = numbers.stream()
                .anyMatch(n -> n > 25);

        System.out.println(result);

    }
}
