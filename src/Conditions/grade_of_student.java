package Conditions;

import java.util.Scanner;

public class grade_of_student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks  ");
        int n = scan.nextInt();
        if(n>=80){
            System.out.println("Very good");
        }
        else if (n >= 61) {
            System.out.println("good");

        }
        else if(n>=41){
            System.out.println("Average ");
        }
        else{
            System.out.println("fail");
        }
    }
}
