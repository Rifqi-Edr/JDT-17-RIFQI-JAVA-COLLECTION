package org.indivaragroup.stream;

import java.util.List;
import java.util.stream.Stream;

public class RunStreamExample {
    public static void main(String[] args) {

        // Stream TIDAK berjalan sampai terminal operation dipanggil
        Stream stream = Stream.of("Java", "Python", "Kotlin");

        // Terminal operation: forEach — iterasi setiap elemen
        stream.forEach(System.out::println);
        // Output: Java, Python, Kotlin

        // Terminal operation: count — menghitung jumlah elemen
        long count = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("Jumlah: " + count); // 5

        // Terminal operation: collect — mengumpulkan ke List
        List result = Stream.of("A", "B", "C")
                .collect(java.util.stream.Collectors.toList());
        System.out.println(result); // [A, B, C]
    }
}

