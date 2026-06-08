package collectionimplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListImp {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
       // List<String> lst1 = new ArrayList<>();
//        lst1.add("Sourav");
//        lst1.add("Dhruv");
//        lst1.add("Mayank");


//        System.out.println(lst1);
        lst.add(12);
        lst.add(23);
        lst.add(34);
        lst.add(45);
        lst.add(57);
        lst.add(77);
        System.out.println(lst);
        System.out.println(lst.contains(34));
        System.out.println(lst.size());
        System.out.println(lst.reversed());
        System.out.println(lst.get(3));
        System.out.println(lst.get(2));
        Collections.sort(lst);
        System.out.println(lst);
        lst.hashCode();
        System.out.println(lst.hashCode());
        lst.addFirst(7);
        System.out.println(lst);
        lst.addLast(100);
        System.out.println(lst);
        System.out.println(lst.size());
        lst.remove(7);
        System.out.println(lst);
        System.out.println(lst.isEmpty());


    }
}
