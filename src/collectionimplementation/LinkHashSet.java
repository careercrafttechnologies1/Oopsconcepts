package collectionimplementation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(23);
        lhs.add(34);
        lhs.add(77);
        lhs.add(56);
        System.out.println(lhs);
        Iterator<Integer> it= lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
