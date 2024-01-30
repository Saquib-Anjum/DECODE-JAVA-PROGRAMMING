package Array;

import java.util.Scanner;

public class Twopointer2nd_method {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the size of an array    ");
        int n=scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of index "+i+" ");
            arr[i]=scan.nextInt();
        }
//        int n=arr.length;
        System.out.println("array is   ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(  "reverse is  ");
        int i=0;
        int j=n-1;
//        for (int i = 0; i <arr.length ; i++) {
////reverse
//            int j=n-1-i;
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            if(arr[i]>arr[j]) break;
//        }

        // reverse
        reverse(arr , i, j);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
