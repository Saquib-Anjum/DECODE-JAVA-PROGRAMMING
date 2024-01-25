package Arrays;

import java.util.Scanner;

public class Product_of_array {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("enter the size of an array  ");
        int n= scan.nextInt();
        int[] arr  = new int[n];
        int a=0;
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter the values of index ->"+a++ +" ");
            arr[i]=scan.nextInt();
        }
        int product=1;
        for (int i = 0; i <n ; i++) {
            product=product*arr[i];

        }
        System.out.println("product  is "+product);
    }
}
