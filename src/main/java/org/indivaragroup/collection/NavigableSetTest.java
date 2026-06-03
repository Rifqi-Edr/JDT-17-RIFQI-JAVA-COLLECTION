package org.indivaragroup.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    static void main() {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);

        System.out.println("Isi navigableSet : " + set);
        System.out.println("lower(6) = " + set.lower(6));
        System.out.println("floor(6) = " + set.floor(6));
        System.out.println("higher(6) = " + set.higher(6));
        System.out.println("ceiling(6) = " + set.ceiling(6));
        System.out.println("ceiling(5) = " + set.ceiling(5));
        System.out.println("Urutan terbaik : " + set.descendingSet());

    }

}
