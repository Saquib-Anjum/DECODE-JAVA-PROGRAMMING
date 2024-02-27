package Recursion_In_Java;

import java.util.Scanner;

public class _0_to_N_RecursiveCall {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number    ");
        int n= scan.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        //this is called ->call before work
        print(n-1);
        System.out.print(n+" ");
    }
}
