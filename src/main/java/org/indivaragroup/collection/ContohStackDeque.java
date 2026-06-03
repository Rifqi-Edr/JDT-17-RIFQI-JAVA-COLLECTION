package org.indivaragroup.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ContohStackDeque {
    static void main() {
        Deque stack = new ArrayDeque<>();

        stack.push("Buku 1");
        stack.push("Buku 2");
        stack.push("Buku 3");
        System.out.println("Tumpukan: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Keluar: " + stack.pop());
        }
    }
}
