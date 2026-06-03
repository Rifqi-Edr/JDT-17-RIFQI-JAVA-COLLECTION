package org.indivaragroup.collection;

import java.util.HashSet;

public class HashSetLearn {
    static void main() {
        HashSet<String> buah = new HashSet<>();

        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Pisang");
        buah.add("Apel");

        System.out.println("Isi hashset " + buah);
        System.out.println("Mengandung jeruk " + buah.contains("Jeruk"));
        System.out.println("Jumlah data unik " + buah.size());
    }

}
