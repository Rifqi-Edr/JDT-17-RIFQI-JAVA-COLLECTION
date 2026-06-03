package org.indivaragroup.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionStreamExample {
    public static void main(String[] args) {

        // Stream dari List
        List list = List.of("Apel", "Mangga", "Jeruk");
        Stream listStream = list.stream();
        listStream.forEach(System.out::println);

        // Stream dari Set
        Set set = Set.of(10, 20, 30, 40);
        set.stream().forEach(System.out::println);

        // Stream dari Map (stream key-value pair)
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
