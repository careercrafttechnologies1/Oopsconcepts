package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapFlatMap {
//    import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
        static void main(String[] args) {
            //  List<Integer> list = Arrays.asList(21,54,34,64,12,95,84,64);
            //List<Integer> list1 = list.stream()
            //        .distinct()
            //      .sorted()
            //    .toList();
            //System.out.println(list1);
            //list.stream().forEach(System.out::println);

            //map
            List<String> list = Arrays.asList("ankit","rohit","dhruv","sourav");
            List<String> list1 = list.stream().map(String::toUpperCase).toList();
            System.out.println(list1);
            list.stream().map(String::toUpperCase).forEach(System.out::println);
            //flatmap

            List<List<String>> courses = Arrays.asList(
                    Arrays.asList("java", "python"),
                    Arrays.asList("html","css"),
                    Arrays.asList("css","javascript")
            );
            List<String> list2 = courses.stream().flatMap(List::stream).toList();
            System.out.println(list2);
            courses.stream().flatMap(List::stream).forEach(System.out::println);
            List<List<Integer>> num = Arrays.asList(
                    Arrays.asList(1,2,3),
                    Arrays.asList(4,5,6),
                    Arrays.asList(7,8,9)
            );
            num.stream().flatMap(List::stream).forEach(System.out::println);
        }
    }

