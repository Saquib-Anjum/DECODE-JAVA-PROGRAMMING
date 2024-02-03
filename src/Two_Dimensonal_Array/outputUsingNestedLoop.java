package Two_Dimensonal_Array;

import java.util.Scanner;

public class outputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter size of row  ");
        int n=sc.nextInt();

        System.out.print("Enter size of column  ");
        int m=sc.nextInt();


        int[][]  arr = new int[n][m];
        //taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("enter the value of index  "+i+" and "+j+" ");
                arr[i][j]= sc.nextInt();
            }

        }

        //printing output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}
