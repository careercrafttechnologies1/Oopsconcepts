package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FirstCharacterAsKey {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("Vijendra", "Amit", "Priya", "Sourav","Dhruv","Ankit");

        System.out.println("Key : Value");
        System.out.println("-----------");

        // Stream to print first character as key and name as value
        names.stream()
                .forEach(name -> {
                    char key = name.charAt(0);
                    System.out.println(key + " : " + name);
                });
    }
}
