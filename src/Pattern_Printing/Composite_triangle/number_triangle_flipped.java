package Pattern_Printing.Composite_triangle;

import java.util.Scanner;

public class number_triangle_flipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            //int a=1;
            for(int j=1;j<=n+1-i;j++){
//                if (j>=(n+1)-i)
//                    System.out.print(a+++" ");
//                else
//                    System.out.print(" "+" ");
                System.out.print(" "+" ");


            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
