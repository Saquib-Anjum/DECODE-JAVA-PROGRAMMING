package BasicSorting;

import java.util.Arrays;

public class InbuildSort {
    public static void main(String[] args) {
        int[] arr={4,5,3,9,6,-1};
        System.out.println("Array");
        for(int ele: arr){
            System.out.print(ele+"  ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("sorted Arrasy  ");
        for(int ele: arr){
            System.out.print(ele+"  ");
        }
    }
}
