package java8;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
      public class FlatMapInteger {
        public static void main(String[] args) {

            // FlatMap with Integer
            List<List<Integer>> numbers = Arrays.asList(
                    Arrays.asList(1, 2),
                    Arrays.asList(3, 4),
                    Arrays.asList(5, 6)
            );

            List<Integer> list = numbers.stream()
                    .flatMap(List::stream)
                    .toList();

            System.out.println(list);

            numbers.stream()
                    .flatMap(List::stream)
                    .forEach(System.out::println);
        }
    }
}
