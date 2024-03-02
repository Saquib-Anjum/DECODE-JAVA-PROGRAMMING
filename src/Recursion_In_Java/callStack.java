package Recursion_In_Java;

import java.util.Scanner;

public class callStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number   ");
        int n=sc.nextInt();
       PreInPost(n);
    }

    private static void PreInPost(int n) {
        if(n==0) return;
        System.out.println(n);
        PreInPost(n-1);
        System.out.println(n);
        PreInPost(n-1);
        System.out.println(n);
    }
}
