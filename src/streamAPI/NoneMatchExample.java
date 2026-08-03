package streamAPI;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        boolean result = numbers.stream()
                .noneMatch(n -> n > 100);

        System.out.println(result);
    }
}
