package Conditions;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name  ");
        int n = scan.nextInt();
        if(n<0){

            System.out.println(-1*n);

        }
        else{
            System.out.println(n);
        }
    }
}
