package org.indivaragroup.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetLearn {
    static void main() {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        String[] buah = {"Pisang", "Apel", "Jeruk", "Mangga"};

        for (String item :buah) {
            hashSet.add(item);
            linkedHashSet.add(item);
        }
        System.out.println("HashSet : " + hashSet);
        System.out.println("LinkedHashSet : " + linkedHashSet);
    }
}
