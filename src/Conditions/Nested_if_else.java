package Conditions;

import java.util.Scanner;

public class Nested_if_else {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three numbers  ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c= scan.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+"a is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is greatest");
            }
            else{
                System.out.println(c+"  is greatest");
            }
        }



    }
}
