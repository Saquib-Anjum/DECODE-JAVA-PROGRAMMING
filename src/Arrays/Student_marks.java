package Arrays;

import java.util.Scanner;

public class Student_marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of student  -> "  );
        int n= scan.nextInt();
        int[] arr= new int[n];
        //marks as input
        int a=0;
        for (int i = 0; i <n ; i++) {
            System.out.print("enter the marks of student whose roll no is "+a+" ");

             arr[i]=scan.nextInt();
                a++;
        }
        System.out.print("student whose marks is less than 35  ->>>");
        for (int i = 0; i <n ; i++) {
            if(arr[i]<=35)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
