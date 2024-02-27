package Recursion_In_Java;

import java.util.Scanner;

public class _0_to_N {
    //static int m;
    public static void print(int n,int m){
        //here I passed two references
        if(n==m ) return;
        System.out.print(n+" ");
        print(n+1,m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number   ");
        int n=sc.nextInt();
        System.out.println("Enter the last number  ");
        int m=sc.nextInt();
        print(n,m);
    }
}
