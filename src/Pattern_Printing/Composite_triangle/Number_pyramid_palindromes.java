package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class Number_pyramid_palindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            //for the spaces

            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            //for the simple number teriangle
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");

            }
            //for another triangle
            for(int l=i-1;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
