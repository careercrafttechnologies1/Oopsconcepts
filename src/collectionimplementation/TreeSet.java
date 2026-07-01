package collectionimplementation;

import java.util.Iterator;
import java.util.Set;

public class TreeSet{
    public static void main(String[] args) {
        Set<Integer> t = new java.util.TreeSet<>();
        t.add(23);
        t.add(7);
        t.add(35);
        t.add(55);
        t.add(89);
        t.add(56);
        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.contains(4));
        System.out.println(t.hashCode());
        System.out.println(t.remove(7));
        System.out.println(t.isEmpty());
        //System.out.println(t.);


        Iterator<Integer>iterator= t.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
