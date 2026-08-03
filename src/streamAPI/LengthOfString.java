package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfString {

        public static void main(String[] args) {

            List<String> names = Arrays.asList("Java","Python","Spring");

            List<Integer> length = names.stream()
                    .map(String::length)
                    .collect(Collectors.toList());

            System.out.println(length);
        }
    }

