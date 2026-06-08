package collectionimplementation;

import java.util.ArrayList;
import java.util.List;

public class FailFastCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(6);

        for(Integer integer: list)
        {
            System.out.println(list);
          //  list.add(9);
        }
    }
}
