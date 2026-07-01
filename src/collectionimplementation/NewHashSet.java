package collectionimplementation;

import java.util.HashSet;
import java.util.Set;

public class NewHashSet {
    public static void main(String[] args) {
        Set<Integer> str = new HashSet<>();

        str.add(31);
        str.add(23);
        str.add(34);
        str.add(32);
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(str.hashCode());
        System.out.println(str);
        Set<String> str1 = new HashSet<>();
        str1.add("Sourav");
        str1.add("Dhruv");
        System.out.println(str1);
        System.out.println(str1.size());
    }
}
