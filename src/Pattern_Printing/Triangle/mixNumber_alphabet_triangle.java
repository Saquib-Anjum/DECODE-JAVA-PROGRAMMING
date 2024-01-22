package Pattern_Printing.Triangle;

import java.util.Scanner;

public class mixNumber_alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2 !=0)
                System.out.print(j+" ");
                else//(i%2==0)
                    System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

    }
}
