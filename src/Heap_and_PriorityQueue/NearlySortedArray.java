package Heap_and_PriorityQueue;
import java.util.*;
public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,3,2,10,8,9};
        List<Integer> ans = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k = 3;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k) ans.add(pq.remove());
        }
        while(pq.size()>0){
            ans.add(pq.remove());
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
        for(int i=0;i<ans.size()-1; i++){
            if(ans.get(i)>ans.get(i+1)){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
