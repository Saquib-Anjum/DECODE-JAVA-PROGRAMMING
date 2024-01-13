package Conditions;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number  ");
        long a = scan.nextLong();
        if(a%2==0){
            System.out.println("Number is even ");

        }
        else{
            System.out.println("number is odd");
        }
    }

}
