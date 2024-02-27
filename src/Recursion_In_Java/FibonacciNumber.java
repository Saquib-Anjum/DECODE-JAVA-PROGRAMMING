package Recursion_In_Java;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to index " + n + ":");
        for (int i = 0; i <= n; i++) {
            int result = fibo(i);
            System.out.print(result + " ");
        }
    }

    private static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
