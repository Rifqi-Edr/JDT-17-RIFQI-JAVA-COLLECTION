package org.indivaragroup.collection;

import java.util.ArrayList;
import java.util.List;

public class ListProblemOne {
    static void tampilkanData(List data) {
        data.add("Data tidak sengaja bertambah");
        System.out.println("Di dalam data : " + data);
    }

    public static void main(String[] args) {
        ArrayList data = new ArrayList<>();
        data.add("budi");
        data.add("Siti");

        System.out.println("Sebelum method di panggil: " + data);
        tampilkanData(data);
        System.out.println("Sesudah data di panggil: " + data);
    }
}
