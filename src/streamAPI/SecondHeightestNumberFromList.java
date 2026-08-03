package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHeightestNumberFromList {
    public static void main(String[] args) {
        List<Integer> listno = Arrays.asList(12,15,14,23,80,65,45,89);
        Integer secondHeightest = listno.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println("Second highest number: " + secondHeightest);
    }
}
