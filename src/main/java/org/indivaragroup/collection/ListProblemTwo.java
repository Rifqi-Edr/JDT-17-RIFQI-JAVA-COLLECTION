package org.indivaragroup.collection;

import java.util.ArrayList;
import java.util.List;

public class ListProblemTwo {
    public static List getData() {
        List data = new ArrayList<>();
        data.add("Apple");
        data.add("Mangga");
        data.add("Jeruk");
        return data;
    }

    static void main() {
        List data = getData();

        System.out.println("Data awal: " + data);
        data.add("Pisang");
        System.out.println("Setelah di ubah: " + data);
    }
}
