package Basics;

import java.util.Scanner;

public class takingINPUT {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("hii enter your number please here! ");
        int a= sc.nextInt();
        System.out.println("Again enter your numbere  !  ");
        int b = sc.nextInt();

        System.out.println("hii here is your sum   :"+(a+b));

    }
}

