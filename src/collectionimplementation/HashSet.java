package collectionimplementation;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set <Integer>  hs = new java.util.HashSet<>();
        hs.add(23);
        hs.add(34);
        hs.add(45);
        hs.add(56);
        System.out.println(hs);
        Iterator<Integer>i= hs.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
