package Conditions;

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number  ");
        long a = scan.nextLong();

        System.out.println(a%2==0? "even" : "odd");
    }
}
