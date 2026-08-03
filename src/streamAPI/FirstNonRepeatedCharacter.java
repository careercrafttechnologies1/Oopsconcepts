package streamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static <first> void main(String[] args) {

        String word = "swiss";
        String FirstNonRepeatedCharacter = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(w->w.getValue()==1).findFirst().get().getKey();
        System.out.println(FirstNonRepeatedCharacter);
    }

}
