package Pattern_Printing.Triangle;

import java.util.Scanner;

class Alphabet_triangle_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}






