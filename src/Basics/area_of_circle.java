package Basics;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        double pi1 = 3.14159;
        double r1 = 6;
        double area_of_circle = pi1 * (r1 * r1);
        System.out.println("area of circle   :  " + area_of_circle);
        double v = (4 * pi1 * r1 * r1 * r1) / 3;
        System.out.println("Area of sphere  : " + v);

        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius   :  ");
        double r = sc.nextDouble();
        double area = pi * (r * r);
        System.out.println("area is  :  "+area);




    }

}