package org.indivaragroup.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConverstionImmutableList {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Apel");
        list.add("Mangga");
        list.add("Jeruk");

        List<String> immutableList = Collections.unmodifiableList(list);

        System.out.println("Isi immutable list: " + immutableList);

        try {
            immutableList.add("Pisang");
        } catch (UnsupportedOperationException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
    }
}
