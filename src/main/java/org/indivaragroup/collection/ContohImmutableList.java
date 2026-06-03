package org.indivaragroup.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContohImmutableList {
    static void main() {
        List list1 = Collections.emptyList();
        List list2 = Collections.singletonList("Apel");
        List list3 = List.of("Apel", "Mangga", "Jeruk");

        List existingList = new ArrayList<>();
        existingList.add("Pisang");
        existingList.add("Semangka");
        List list4 = Collections.unmodifiableList(existingList);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        /*
        * atribut : nama, alamt, jenis kelamin, gaji
        * main class buat 10 kota, buat beberapa single dan beberapa multiple
        * buat beberapa fuction : 1. sorting berdasarkan nama,
        * 2. sorting berdasarkan jenis kealmin (dengan total),
        * 3. sorting berdasarkan kota,
        * 4. sorting mengurutkan gaji (descending)
        * */
    }
}
