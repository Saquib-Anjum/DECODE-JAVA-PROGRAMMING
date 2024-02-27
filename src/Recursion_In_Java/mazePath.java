package Recursion_In_Java;

import java.util.Scanner;

public class mazePath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows    ");
        int n=sc.nextInt();
        System.out.print("Enter the number of columns     ");
        int m=sc.nextInt();
        int res=maze(1,1,n,m);
        System.out.println("number of ways "+res);

    }

    private static int maze(int row, int col, int n, int m) {
        if(n==row ||m==col) return 1;
        int right_ways=maze(row,col+1,n,m);
        int down_ways=maze(row+1,col,n,m);
        return right_ways+down_ways;
    }
}
