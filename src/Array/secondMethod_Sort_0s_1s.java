package Array;

import java.util.Scanner;

public class secondMethod_Sort_0s_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array     ");
        int n= sc.nextInt();
        //creating array
        int[] arr= new int[n];
        //taking input as array
        for (int i = 0; i < n; i++) {
            System.out.print(" inter the value of index  "+i+" ");
            arr[i]=sc.nextInt();

        }
        System.out.println();
        //print array
        System.out.println("Array is ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //sorting
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1&&arr[j]==0){
               // int temp = arr[i];
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;

            }
        }
        System.out.println();
        System.out.println("sorted array");
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }

}
