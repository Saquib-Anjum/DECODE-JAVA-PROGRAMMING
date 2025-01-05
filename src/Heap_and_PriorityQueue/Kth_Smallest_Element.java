package Heap_and_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] arr = {3,12,7,19,17,23,54,67,-1,-11};
        int k= 5;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
     if(pq.size()>k) pq.remove();
        }

        System.out.println(pq.peek());
    }
}
