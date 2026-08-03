package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamExp {
    public static void main(String[] args) {
        List<String>strings= Arrays.asList("2,3,4,5,6,7,84,42,46,3");

        strings.stream().
                forEach(System.out::println);


List<Integer>integers=Arrays.asList(6,7,9,4,5);
integers.stream().forEach(System.out::println);

    }
}
