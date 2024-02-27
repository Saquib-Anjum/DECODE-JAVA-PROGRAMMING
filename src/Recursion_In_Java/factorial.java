package Recursion_In_Java;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 1) return n;

      int ans=n*fact(n-1);
        //System.out.print(ans+" ");
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int n=sc.nextInt();
        int res=fact(n);
        System.out.println("factorial is  "+res);
    }
}
