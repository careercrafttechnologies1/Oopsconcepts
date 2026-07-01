package collectionimplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethodDemo {
    public static void main(String[] args) {

            // 1. add()
            List<String> c1 = new ArrayList<>();
            c1.add("Java");
            c1.add("Python");
            c1.add("C++");
            System.out.println("After add(): " + c1);

            // 2. addAll()
            List<String> c2 = new ArrayList<>();
            c2.add("Java");
            c2.add("Python");
            c2.add("C++");
            c2.add("JavaScript");

            c1.addAll(c2);
            System.out.println("After addAll(): " + c1);

            // 3. remove()
            c1.remove("C++");
            System.out.println("After remove(): " + c1);

            // 4. removeAll()
            List<String> removeList = new ArrayList<>();
            removeList.add("Java");
            removeList.add("Python");

            c1.removeAll(removeList);
            System.out.println("After removeAll(): " + c1);

            // 5. retainAll()
            List<String> c3 = new ArrayList<>();
            c3.add("Java");
            c3.add("JavaScript");
            c3.add("HTML");

            c2.retainAll(c3);
            System.out.println("After retainAll(): " + c2);

            // 6. contains()
            System.out.println("contains('Java') : " + c2.contains("Java"));

            // 7. containsAll()
            System.out.println("containsAll(c3) : " + c2.containsAll(c3));

            // 8. size()
            System.out.println("size() : " + c2.size());

            // 9. isEmpty()
            System.out.println("isEmpty() : " + c2.isEmpty());

            // 10. iterator()
//            System.out.print("iterator() : ");
            Iterator<String> it = c2.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }

            // 11. toArray()
            Object[] arr = c2.toArray();
            System.out.print("toArray() : ");
            for (Object obj : arr) {
                System.out.print(obj + " ");
            }

            // 12. equals()
            List<String> c4 = new ArrayList<>();
            c4.add("Java");
            c4.add("JavaScript");

            System.out.println("equals() : " + c2.equals(c4));

            // 13. hashCode()
            System.out.println("hashCode() : " + c2.hashCode());

            // 14. stream()
            System.out.print("stream() : ");
            c2.stream().forEach(x -> System.out.print(x + " "));

            // 15. clear()
            c4.clear();
            System.out.println("After clear(): " + c4);
            System.out.println("isEmpty() after clear(): " + c4.isEmpty());
        }
    }

