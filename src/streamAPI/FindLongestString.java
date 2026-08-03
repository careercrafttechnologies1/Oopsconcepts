package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        String[] strArray = {"Sourav","Vijender","Dhruv","Ankit"};
        String longestString = Arrays.stream(strArray).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println(longestString);

        List<String> input=Arrays.asList("Sourav","Vijender","Dhruv","Ankit");
        String hString = input.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println(hString);
    }
}
