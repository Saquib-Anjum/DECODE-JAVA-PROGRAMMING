package Pattern_Printing.Special_Triangle;

import java.util.Scanner;

public class odd_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your rows    ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j+=2){

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    }

