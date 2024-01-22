package Pattern_Printing.Square;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no ");
        int n=scan.nextInt();

        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n; j++){
                System.out.print((char)(j+64)+" ");

            }
            System.out.println();
        }
//        int a=23;
//        System.out.println((char)a);
    }
}
