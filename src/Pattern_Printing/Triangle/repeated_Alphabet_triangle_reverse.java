package Pattern_Printing.Triangle;

import java.util.Scanner;

public class repeated_Alphabet_triangle_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
