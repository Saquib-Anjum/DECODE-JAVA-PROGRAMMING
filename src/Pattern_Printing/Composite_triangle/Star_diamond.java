package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class Star_diamond {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int n= scan.nextInt();
        int nsp=n-1;
        int nst=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {
                System.out.print(" "+" ");

            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("*"+" ");

            }
            nst+=2;
            nsp--;
            System.out.println();
        }
        nsp=1;
        nst=nst-n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=nsp ; j++) {
                System.out.print(" "+" ");

            }
            for (int j = 1; j <=nst ; j++) {
                System.out.print("*"+" ");

            }
            nst-=2;
            nsp++;
            System.out.println();
        }
    }
}