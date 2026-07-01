package collectionimplementation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. Add Method
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(9);
        System.out.println(arrayList);

        // 2. Size Method
        System.out.println(arrayList.size());

        // 3. AddAll Method
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(6);
        arrayList1.add(45);
        arrayList1.add(78);
        arrayList1.add(45);
//        arrayList1.addAll(arrayList);
//        System.out.println(arrayList1);

        // 4. Get Method
        System.out.println(arrayList.get(2));

        // 5. Remove Method
        arrayList.remove(3);
        System.out.println(arrayList);

        // 6.Contains Method
        System.out.println(arrayList.contains(9));

        // 7.ContainsALL Method
        System.out.println(arrayList.containsAll(arrayList1));

        // 8. IndexOf Method
        System.out.println(arrayList.indexOf(8));

        // 9. IsEmpty Method
        System.out.println(arrayList.isEmpty());

        // 10. RemoveAll Method
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);

        // 11. GetFirst Method
        System.out.println(arrayList.getFirst());

        // 12. Iterator Method
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 13. Set method
        arrayList.set(2,7);
        System.out.println(arrayList);

        // 14.Clear Method
        arrayList.clear();
        System.out.println(arrayList);

    }
}
