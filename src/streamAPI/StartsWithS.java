package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StartsWithS {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sourav","Gourav","Sonu","Ankit","Dhruv");
        List<String>filterName=names.stream().filter(name ->name.startsWith("S")).toList();
        System.out.println(filterName);
    }
}
