package Array;

import java.util.Arrays;
import java.util.*;

public class Copy_of_array {
    public static void main(String[] args) {
//    int[] arr ={1,2,3,4,5,6,7};
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        int[] num = arr;//this is shallow copy not deep copy
//        num[0]=4;
//        System.out.println(arr[0]);
//
//
//        int[] brr= Arrays.copyOf(arr,arr.length);
//        brr[0]=9;
//        System.out.println(brr[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n= sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

    }
}
