package Conditions;

import java.util.Scanner;

public class shayam_Ram_Ajay {
    public static void main(String[] args) {
        /*
        if the age of Ram Shayam and Ajay and input through the Keyboard
         write a program to determine the youngest of the of three
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the age of ram    ");
        int r = scan.nextInt();
        System.out.print("Enter the age of Shyam    ");
        int s = scan.nextInt();
        System.out.print("Enter the age of Ajay    ");
        int a = scan.nextInt();


        if(r>s && r>a){
            System.out.println("ram is youngest");
        }
        else if(s>r&&s>a){
            System.out.println("shyam is youngest");
        }
        else{
            System.out.println("Ajay is youngest");
        }
    }
}
