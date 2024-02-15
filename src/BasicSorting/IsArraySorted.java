package BasicSorting;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array  ");
        int n=sc.nextInt();
        int[] arr= new int[n];

        //input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the index   "+i+" ");
        arr[i]= sc.nextInt();
        }
        //printing
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");


        }
        boolean flag=true;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                flag=false;
                    }
        }
        System.out.println();
        if(flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
