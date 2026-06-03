package org.indivaragroup.collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueContoh {
    static void main() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(1);
        pq.offer(8);
        pq.offer(3);
        pq.offer(9);
        pq.offer(2);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> pqTerbalik = new PriorityQueue<>(Collections.reverseOrder());

        pqTerbalik.offer(5);
        pqTerbalik.offer(1);
        pqTerbalik.offer(8);
        pqTerbalik.offer(3);
        pqTerbalik.offer(9);
        pqTerbalik.offer(2);

        System.out.println("PriorityQueue reverse (urutan internal) : " + pqTerbalik);

        System.out.println("Kelaura dati que reverse(terbesar) : ");
        while (!pqTerbalik.isEmpty()) {
            System.out.println(pqTerbalik.poll() + " ");
        }
        System.out.println();
    }
}
