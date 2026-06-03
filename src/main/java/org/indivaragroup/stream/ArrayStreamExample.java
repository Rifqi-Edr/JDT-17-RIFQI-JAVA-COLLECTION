package org.indivaragroup.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamExample {
    public static void main(String[] args) {

        // Cara 1: Menggunakan Arrays.stream()
        String[] names = {"Budi", "Ani", "Citra"};
        Stream<String> streamFromArray = Arrays.stream(names);
        streamFromArray.forEach(System.out::println);

        // Cara 2: Menggunakan Stream.of() dengan array
        Integer[] numbers = {1, 2, 3, 4, 5};
        Stream<Integer> streamOfNumbers = Stream.of(numbers);
        streamOfNumbers.forEach(System.out::println);

        // Cara 3: Subset dari array (dari index 1 sampai 3)
        Stream<String> subStream = Arrays.stream(names, 0, 2);
        subStream.forEach(System.out::println); // Budi, Ani
    }
}

