package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListAndRemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,3,44,53,23,45,67,77);
        List<Integer> list2 = Arrays.asList(3,2,34,33,56,6,37,77,89);

        List<Integer> margeList = Stream.concat(list1.stream(),list2.stream()).distinct()
                .sorted().collect(Collectors.toList());
        System.out.println("Marge list with no duplicate :" + margeList);
    }
}
