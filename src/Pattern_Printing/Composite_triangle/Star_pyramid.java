package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class Star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        //int c = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {

                    System.out.print(" "+" ");





            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
