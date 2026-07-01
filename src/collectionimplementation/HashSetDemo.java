package collectionimplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Sourav");
        str.add("Sourabh");
        str.add("Gourav");
        System.out.println(str);
        Iterator iterator = str.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
