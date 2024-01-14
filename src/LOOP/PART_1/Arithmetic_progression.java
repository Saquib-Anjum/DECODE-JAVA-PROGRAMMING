package LOOP.PART_1;

import java.util.Scanner;

public class Arithmetic_progression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number    ");

        int n= scan.nextInt();
        for(int i=1; i<=2*n-1;i+=2){
            System.out.println(i);
        }

    }
}
