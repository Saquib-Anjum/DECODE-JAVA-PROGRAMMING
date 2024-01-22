package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class Star_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        //for upper straight star line.
        for(int j=1;j<=2*n-1;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
        n--;

        for(int i=1;i<=n;i++){

            for(int j=1 ; j<=n+1-i;j++) {
                System.out.print("*"+" ");
            }
            //for the spaces

            for(int j=1;j<=2*i-1;j++){
               System.out.print(" "+" ");
           }
            //for the simple number teriangle
            for(int k=1;k<=n+1-i;k++){
                System.out.print("*"+" ");

            }
//            //for another triangle
//            for(int l=i-1;l>=1;l--){
//                System.out.print(l+" ");
//            }
            System.out.println();
        }
    }
}
