package Recursion_In_Java;

import java.util.Scanner;

public class sum_1_to_N {
    public static void sum(int n,int sum) {
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+n);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number    ");
        int n=sc.nextInt();
        sum(n,0);
    }
}
