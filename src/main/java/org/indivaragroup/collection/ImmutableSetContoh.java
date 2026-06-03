package org.indivaragroup.collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableSetContoh {
    static void main() {
        Set setKosong = Collections.emptySet();

        Set setSatu = Collections.singleton("Apel");

        Set setModern = Set.of("Apel", "Mangga", "Jeruk");

        Set existingSet = new LinkedHashSet<>();
        existingSet.add("Semangka");
        existingSet.add("Pisang");
        Set setTidakBisaDiubah = Collections.unmodifiableSet(existingSet);

        System.out.println("setKosong = " + setKosong);
        System.out.println("setSatu = " + setSatu);
        System.out.println("setModern = " + setModern);
        System.out.println("setTidakBisaDiuba = " + setTidakBisaDiubah);
    }
}
