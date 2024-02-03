package Two_Dimensonal_Array;

import java.util.Scanner;

public class Student_Rollno_abaMarks {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of student  ");
        int n =sc.nextInt();
        int m=2;
        int[][] arr  =new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print("Enter roll "+i+" "+j+" ");
                arr[i][j]=sc.nextInt();



            }
//            System.out.println();
        }
        System.out.println();
        System.out.println("Result is  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}




