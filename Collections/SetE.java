package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class SetE {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set.add(9);
        set.add(9);
        System.out.println(set);

        // set m indexing based access nahi hota hai
        // set.get(8);

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(90);
        list.add(90);

        System.out.println(list);
        list.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>();

        Set<Integer> set2 = new HashSet<>();

    }

}
