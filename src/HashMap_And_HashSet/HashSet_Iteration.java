package HashMap_And_HashSet;

import java.util.HashSet;

public class HashSet_Iteration {
    public static void main(String[] args) {
        HashSet<Integer> arr = new HashSet<>();
        arr.add(45);
        arr.add(67);
        arr.add(87);
        arr.add(100);
        for (int ele : arr) {
            System.out.println(ele + " ");

        }
    } 
}
