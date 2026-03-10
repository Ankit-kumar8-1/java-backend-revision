package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("For loop");

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i : arr) {
            System.out.println(i);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Iterator .....");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);
        System.out.println("this application us work correctley ");
    }
}
