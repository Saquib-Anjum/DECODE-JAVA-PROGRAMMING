package Recursion_In_Java;

import java.util.Scanner;

public class Accessing_Array_element_inRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the Array  ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //taking input in array
        for (int i = 0; i < n; i++) {
            System.out.print("enter the value of index  "+i+" ");
            arr[i]=sc.nextInt();

        }
        System.out.println();
        System.out.println("Array is ");
        System.out.println();
        print(0,arr);
    }
    public static void print(int n,int[] arr){
        if(n==arr.length) return;
        System.out.print(arr[n]+"  ");
        print(n+1,arr);

    }
}
