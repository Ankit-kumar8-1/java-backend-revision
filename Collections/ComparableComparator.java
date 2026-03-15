package Collections;

import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparableComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(5);

        list.sort((a, b) -> b - b);

        System.out.println(list);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 22);
        map.put(2, 33);
        map.put(3, 44);

        for (Integer i : map.values()) {
            System.out.println(i);
        }
    }

}
