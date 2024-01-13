package Conditions;

import java.util.Scanner;

import static java.lang.System.*;

public class greatest_of_them {
    public static void main(String[] args) {
        Scanner scan=new Scanner(in);
        out.println("enter three numbers  ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c= scan.nextInt();


        if(a>=b && a>=c) {
            System.out.println(a + "a is greatest");
        }

        else if(b>=a  &&  b>=c) {
            System.out.println(b + "b is greatest");
        }


        else{ System.out.println(c+"c   is greatest");}

    }
}
