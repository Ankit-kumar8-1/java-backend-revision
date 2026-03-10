package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetE {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        // set m indexing based access nahi hota hai
        // set.get(8);

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(90);
        list.get(0);
    }
}
