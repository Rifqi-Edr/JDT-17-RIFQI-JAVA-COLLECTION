package org.indivaragroup.stream;

import java.util.stream.Stream;

public class MakeStreamExample {
    public static void main(String[] args) {

        // Membuat Stream kosong
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Empty stream count: " + emptyStream.count()); // 0

        // Membuat Stream dengan satu nilai
        Stream<String> singleStream = Stream.of("Hello");
        singleStream.forEach(System.out::println); // Hello

        // Membuat Stream dengan beberapa nilai
        Stream<String> multiStream = Stream.of("Java", "Stream", "API");
        multiStream.forEach(System.out::println);
        // Java
        // Stream
        // API
    }
}

