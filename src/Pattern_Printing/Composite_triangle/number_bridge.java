package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class number_bridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();


//for upper straight star line.
        for(int j=1;j<=2*n-1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        n--;

        for(int i=1;i<=n;i++){//rows
            int a=1;

            for(int j=1 ; j<=n+1-i;j++) {//number
                System.out.print(a+++" ");
            }
            //for the spaces

            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            //for the simple number teriangle
            for(int k=1;k<=n+1-i;k++){
                System.out.print(a+" ");
                    a++;
            }

            System.out.println();
        }
    }
}
