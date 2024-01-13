package Conditions;

import java.util.Scanner;

public class DivisibleBy_5_or_not {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number   ");
        int a = scan.nextInt();
        if(a%5==0 || a%3==0){
            System.out.println("This is divisible by 3 or 5");

        }
        else{
            System.out.println("This number is not divisible by 5 or 3");
        }

    }
}
