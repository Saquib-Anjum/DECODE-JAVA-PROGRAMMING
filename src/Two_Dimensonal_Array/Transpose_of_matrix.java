package Two_Dimensonal_Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Transpose_of_matrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
      System.out.print("Enter the number of rows   ");
        int n= sc.nextInt();

       System.out.print("Enter the number of columns   ");
        int m= sc.nextInt();


        int[][] arr=new int[n][m];

        //taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {System.out.print("Enter index   "+i+" and "+j+"  ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array is " );

       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
         System.out.print(arr[i][j]+" ");

            }
            System.out.println();
           }
//
//       int[][] arr=  {{1 ,2 ,3 ,4 ,5},
//            {6 ,7, 8 ,9, 8},
//            {7 ,6 ,5 ,4 ,3}};
//int n= arr.length;
//int m=arr[0].length;

        System.out.println();


        System.out.println("Transpose matrix is    ");


        for (int j= 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
}
