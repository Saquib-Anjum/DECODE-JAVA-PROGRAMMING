package Conditions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length  ");
        float l = scan.nextFloat();


        System.out.println("Enter the breadth   ");
        float b = scan.nextFloat();

        double p = 2*(l+b);

        System.out.println("perimeter of rectangle   "+p);

    }
}
