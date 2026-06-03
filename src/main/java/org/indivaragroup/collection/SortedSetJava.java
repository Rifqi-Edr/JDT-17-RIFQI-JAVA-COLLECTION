package org.indivaragroup.collection;

import java.lang.ref.SoftReference;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetJava {
    static void main() {
        SortedSet<Integer> angka = new TreeSet<>();

        angka.add(2);
        angka.add(5);
        angka.add(8);
        angka.add(1);
        angka.add(9);
        angka.add(3);

        System.out.println("Data Terurut" + angka);

        TreeSet<Integer> treeSet = (TreeSet<Integer>) angka;
        System.out.println("Nilai terkecil: " + treeSet.first());
        System.out.println("Nilai terbesar: " + treeSet.last());
        System.out.println("headset(5): " + treeSet.headSet(5));
        System.out.println("tailset(5): " + treeSet.tailSet(5));
        System.out.println("subSet (3, 8): " + treeSet.subSet(3, 8));
    }
}
