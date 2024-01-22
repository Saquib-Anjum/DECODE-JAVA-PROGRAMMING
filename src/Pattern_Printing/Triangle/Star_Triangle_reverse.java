package Pattern_Printing.Triangle;

import java.util.Scanner;

public class Star_Triangle_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
