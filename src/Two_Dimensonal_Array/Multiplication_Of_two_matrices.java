package Two_Dimensonal_Array;

import java.util.Scanner;

public class Multiplication_Of_two_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of  rows  1st matrix          ");
        int n=sc.nextInt();
        System.out.print("Enter the number of column  1st matrix          ");
        int m=sc.nextInt();
        int[][] a= new int[n][m];



        //taking input of Array 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the value of index "+i+" and "+j+"  ");
                a[i][j]=sc.nextInt();

            }

        }

        System.out.println("first Array is   ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the number of  rows  2nd  matrix          ");
        int r=sc.nextInt();
        System.out.print("Enter the number of column  2nd  matrix          ");
        int c=sc.nextInt();
        int[][] b= new int[r][c];
        ///taking input of second array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value of index "+i+" and "+j+"  ");
                b[i][j]=sc.nextInt();
            }
        }
        //printing second Array
        System.out.println("second  Array is   ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("Multiplication of two array ");

        if(m==r) {
            int[][] res= new int[n][c];

            for (int i = 0; i <n; i++) {
                for (int j = 0; j < c; j++) {
                    for (int k = 0; k < m; k++) {

                       // +(a[i][k]*b[k][j]+(a[i][k]*b[k][j]));
                        res[i][j]+=(a[i][k]*b[k][j]);

                    }

                }

            }
            for (int i = 0; i <n; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(res[i][j]+" ");

                }
                System.out.println();

            }


        }
        else{
            System.out.println("multiplication not possible");
        }


    }
}
