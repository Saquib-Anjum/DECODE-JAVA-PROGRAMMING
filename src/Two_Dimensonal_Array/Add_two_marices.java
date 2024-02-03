package Two_Dimensonal_Array;

import java.util.Scanner;

public class Add_two_marices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of row   ");
        int n =scan.nextInt();
        System.out.println("Enter the size of column   ");
        int m =scan.nextInt();

        int[][] arr =new int[n][m];
        int[][] brr =new int[n][m];
        int[][] res =new int[n][m];

        //taking input of (arr) array
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("fill index  "+i+" and "+j+" ");
                arr[i][j]=scan.nextInt();
            }

        }
        System.out.println("array is");
        //printing  of (arr) array
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        //taking input of (brr) array
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("fill index  "+i+" and "+j+" ");
                brr[i][j]=scan.nextInt();
            }

        }
        System.out.println("array is");
        //printing  of (brr) array
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(brr[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("result is  ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((res[i][j]=arr[i][j]+brr[i][j])+"  ");

            }
            System.out.println();
        }

    }
}
