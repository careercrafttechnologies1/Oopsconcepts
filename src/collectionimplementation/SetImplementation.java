package collectionimplementation;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Sourav");
        set.add("Dhruv");
        set.add("Mayank");
        set.add("Ankit");
        System.out.println(set);
        set.contains("Sourav");
        System.out.println(set.contains("Sourav"));
        set.size();
        System.out.println(set.size());
        Set<String> set1 = new HashSet<>();
        set1.add("Sourav");
        set1.add("Dhruv");
        set1.equals(set);
        System.out.println(set1.equals(set));
        System.out.println();

    }
}
