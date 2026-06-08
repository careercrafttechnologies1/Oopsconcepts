package collectionimplementation;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    public static void main(String[] args) {
        List<String> lst  = new ArrayList<>();
        lst.add("Sourav");
        lst.add("Dhruv");
        lst.add("Shivam");
        lst.add("Manish");
        lst.add("Himanshu");
        System.out.println(lst);
        System.out.println(lst.size());
        lst.contains("Mayank");
        System.out.println(lst.contains("Mayank"));
        lst.add(1,"Gourav");
        System.out.println(lst);
        lst.remove("Gourav");
        System.out.println(lst);
        lst.remove(2);
        System.out.println(lst.remove(3));
        lst.reversed();
        System.out.println(lst);
        //lst.get(2);
        System.out.println(lst.get(1));
        System.out.println(lst.get(2));
        lst.clear();
        System.out.println(lst);
        lst.isEmpty();
        System.out.println(lst);


        }
    }

