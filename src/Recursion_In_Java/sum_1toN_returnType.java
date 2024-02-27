package Recursion_In_Java;

import java.util.Scanner;

public class sum_1toN_returnType {
    public static int sum(int n) {
        if(n==0|n==1) return n;
        int res=n+sum(n-1);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number     ");
        int n=sc.nextInt();
        int a=sum(n);
        System.out.println(a);
    }
}
