package Pattern_Printing.Special_Triangle;

import java.util.Scanner;

public class floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(a++ +"  ");

            }
            System.out.println();
        }

    }
}
