package Pattern_Printing.Square;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
