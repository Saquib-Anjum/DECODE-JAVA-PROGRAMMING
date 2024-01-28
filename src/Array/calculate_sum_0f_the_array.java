package Array;

import java.util.Scanner;

public class calculate_sum_0f_the_array {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("enter the size of an array  ");
        int n= scan.nextInt();
        int[] arr  = new int[n];
        int a=0;
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter the values of index ->"+a++ +" ");
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];

        }
        System.out.println("sum is "+sum);
    }
}
