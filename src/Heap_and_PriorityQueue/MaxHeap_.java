package Heap_and_PriorityQueue;

import java.util.*;
import java.util.PriorityQueue;

public class MaxHeap_ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(45);
        pq.add(12);
        pq.add(45);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(11);
        pq.add(54);
        pq.add(32);
        pq.add(80);
        pq.add(-12);
        System.out.println(pq);
        System.out.println(pq.peek());
        int k= pq.remove();
        int s=pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
