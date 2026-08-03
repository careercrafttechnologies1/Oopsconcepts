package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Rohit", "Aman");

        Optional<String> result = names.stream()
                .findAny();

        System.out.println(result.get());
    }
}
