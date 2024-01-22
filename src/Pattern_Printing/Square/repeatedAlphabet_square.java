package Pattern_Printing.Square;

import java.util.Scanner;

public class repeatedAlphabet_square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no  ");
        int n=scan.nextInt();
//        System.out.println("Enter number of column  ");
//        int m = scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n; j++){
                System.out.print((char)(i+64)+"  ");

            }
            System.out.println();
        }

    }
}
