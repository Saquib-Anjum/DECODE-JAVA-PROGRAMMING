package Recursion_In_Java;

import java.util.Scanner;

public class stairPath2 {
    private static int stair(int n){
        if(n<=2) return n;
        return stair(n-2)+stair(n-3);
        //--
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number   ");
        int n=sc.nextInt();
        int res=stair(n);
        System.out.println("number of ways to walk in stairs  "+res+" ");
    }
}
