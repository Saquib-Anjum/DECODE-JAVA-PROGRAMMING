package Pattern_Printing.Square;

import java.util.Scanner;

public class small_Repeated_alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no  ");
        int n=scan.nextInt();
//        System.out.println("Enter number of column  ");
//        int m = scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=n; j++){
                System.out.print((char)(j+96)+" ");

            }
            System.out.println();
        }

    }
}
