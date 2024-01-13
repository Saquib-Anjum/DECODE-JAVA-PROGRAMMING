package Conditions;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        //useless
        ///calculator
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char op = scan.next().charAt(0);
        int b = scan.nextInt();

        switch (op){
            case '+' :
                System.out.println(a+b);
                break;
        }
        switch (op){
            case '-' :
                System.out.println(a-b);
                break;
        }
        switch (op){
            case '*' :
                System.out.println(a*b);
                break;

        }
        switch (op){
            case '/' :
                System.out.println(a/b);
        }
    }
}
