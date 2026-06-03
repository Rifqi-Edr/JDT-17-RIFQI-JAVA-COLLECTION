package org.indivaragroup.collection;

import java.util.TreeSet;

public class TestComparator {
    static void main() {
        TreeSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("Budi", 25));
        people.add(new Person("Andi", 30));
        people.add(new Person("Citra", 22));

        System.out.println(people);
    }
}
