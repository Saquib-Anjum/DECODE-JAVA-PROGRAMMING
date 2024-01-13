package Conditions;

import java.util.Scanner;



public class least_of_them {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three numbers  ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c= scan.nextInt();
        if(a<=b  && a<=c){
            System.out.println(a+" is least");
        }
        else if (b<=a &&b<=c){
            System.out.println(b+"  is least");
        }
        else{
            System.out.println(c+" is least");
        }


    }
}
