package org.indivaragroup.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class ContohQueue {
    static void main() {
        Queue antrian = new ArrayDeque<>();

        antrian.offer("Pelangan A");
        antrian.offer("Pelanggan B");
        antrian.offer("Pelanggan C");

        System.out.println("Antrian: " + antrian);
        System.out.println("Paling depan: " + antrian.peek());

        while (!antrian.isEmpty()) {
            System.out.println("Melayani: " + antrian.poll());
        }
    }
}
