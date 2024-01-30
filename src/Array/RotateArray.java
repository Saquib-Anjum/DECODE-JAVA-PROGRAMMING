package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr ={1,2,4,4,5,6};
        int n= arr.length;
        int k =3;
        System.out.println("array   ");
        for (int i = 0; i <n ; i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //rotation first step
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.println();
        System.out.println("Rotated array   ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }










    }

    public static void reverse(int[]  arr ,int i,int j) {
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


        }


