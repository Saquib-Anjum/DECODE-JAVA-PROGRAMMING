package Conditions;

import java.util.Scanner;

public class OR_operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number   ");
        int a = scan.nextInt();
        if(a%5==0){
            System.out.println("This is divisible by 5");

        }
        else{
            System.out.println("This number is not divisible by 5");
        }
    }
}
