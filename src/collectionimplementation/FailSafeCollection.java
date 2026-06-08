package collectionimplementation;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCollection {
    public static void main(String[] args) {
        List<Integer>lst = new CopyOnWriteArrayList<>();
        lst.add(23);
        lst.add(34);
        lst.add(45);
        for (Integer integer: lst){
            System.out.println(lst);
            lst.add(67);
            
        }
    }
}
