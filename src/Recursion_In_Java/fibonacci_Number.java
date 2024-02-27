package Recursion_In_Java;

import java.util.Scanner;

public class fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  ");
        int n= sc.nextInt();

        System.out.println("Fibonacci series up to index " + n + ":");
        for (int i = 0; i <= n; i++) {
            int result = fibo(i);
            System.out.print(result + " ");
        }
        int res= fibo(n);
        System.out.println();
        System.out.println("Fibonacci of index  "+n+"  is "+res);
    }

    private static int fibo(int n) {
        if(n==0||n==1) return n;
        int ans=fibo(n-1)+fibo(n-2);

        return ans;


    }
}
