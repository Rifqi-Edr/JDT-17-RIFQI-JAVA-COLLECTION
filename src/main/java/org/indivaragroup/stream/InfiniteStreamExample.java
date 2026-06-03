package org.indivaragroup.stream;

import java.util.stream.Stream;

public class InfiniteStreamExample {
    public static void main(String[] args) {

        // Stream.iterate() — menghasilkan data berurutan dengan pola
        // Mulai dari 0, setiap elemen ditambah 2 (bilangan genap)
        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);
        // Output: 0, 2, 4, 6, 8

        // Stream.generate() — menghasilkan data dari supplier function
        // Menghasilkan angka random tanpa batas
        Stream.generate(Math::random)
                .limit(3)
                .forEach(System.out::println);
        // Output: 0.123..., 0.456..., 0.789...
    }
}
