package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class method2_of_star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        //int c = sc.nextInt();
        int nsp=n-1;
        int nst=1;

        for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=nsp ; j++) {

              System.out.print(" "+" ");
            }
            for (int j = 1; j <=nst ; j++) {
               System.out.print("*"+" ");
           }


            System.out.println();
                nsp--;
                nst+=2;
        }
    }
}
