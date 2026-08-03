package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListImp {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(23,45,56,78,89,56,77);
//       List<Integer>list1= list.stream().sorted().distinct().toList();
//        System.out.println(list1);

       // list.stream().sorted().distinct().forEach(System.out::println);
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);
        List<Integer> list2= list1.stream().limit(5).sorted().toList();
        System.out.println(list2);
        List<Integer> list3 = list1.stream().skip(5).toList();
        System.out.println(list3);
        long count = list1.stream().count();
        System.out.println(count);
        List<Integer>list4 = list1.stream().distinct().toList();
        System.out.println(list4);

       // Map and FlatMap
        List<String> name = Arrays.asList("sourav, dhruv, ankit");
        name.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> name1= name.stream().map(String::toUpperCase).toList();
        System.out.println(name1);
        // FlatMap
        List<List<String>> course = Arrays.asList(
                Arrays.asList("Java,Python"),
                Arrays.asList("DataScience"),
                Arrays.asList("SQL,Html")
        );
        List<String>lst = course.stream().flatMap(List::stream).toList();
        System.out.println(lst);
        course.stream().flatMap(List::stream).forEach(System.out::println);

    }
}
