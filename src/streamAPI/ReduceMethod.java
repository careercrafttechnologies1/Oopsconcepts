package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.stream;

public class ReduceMethod {
    public static <List1> void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,5,54,5,4,55,67,778,78);
       Integer sum =  list.stream().reduce(0,Integer::sum);
        System.out.println("SUM = " + sum);

        List<String> list1= Arrays.asList("Sourav","Swain");
       String result = list1.stream().reduce((a,b)->a+b)
                       .orElse("");
        System.out.println(result);
    }
}
