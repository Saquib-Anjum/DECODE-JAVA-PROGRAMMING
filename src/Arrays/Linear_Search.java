package Arrays;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an element    ");
        int n= scan.nextInt();

        int[]arr= new int[n];
        System.out.print("Enter the targeted element  ");
        int a= scan.nextInt();
int b=0;
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter the values of the of the index  -> "+b++ +" ");
arr[i]= scan.nextInt();
        }
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==a)
                flag=true;
            break;

        }
        if (flag==true) System.out.println("Element founnd  ");
        else System.out.println("Element not found  ");
    }
}
