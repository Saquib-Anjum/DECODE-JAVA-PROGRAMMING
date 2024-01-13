package Conditions;

import java.util.Scanner;

public class AND_operator {
    public static void main(String[] args) {
        //divide by 3 or 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1st   ");
        int a = scan .nextInt();
        System.out.println("Enter the number 2nd   ");
        int b = scan .nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("yes");

        }

        else{
            System.out.println("no");
        }




    }
}
