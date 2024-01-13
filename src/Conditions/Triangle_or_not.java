package Conditions;

import java.util.Scanner;

public class Triangle_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st side of triangle    ");
        float a = scan.nextFloat();
        System.out.println("Enter 2nd side of triangle    ");
        float b = scan.nextFloat();
        System.out.println("Enter 3rd side of triangle    ");
        float c = scan.nextFloat();

        if((a+b)>c  &&  (b+c)>a  &&  (c+a)>b){
            System.out.println("it is triangle");
        }
        else{
            System.out.println("invalid triangle");
        }

    }
}
