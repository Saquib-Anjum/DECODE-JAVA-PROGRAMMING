package Conditions;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char op = scan.next().charAt(0);
        int b = scan.nextInt();
        if(op=='+'){
            System.out.println(a+b);
        }
        if(op=='-'){
            System.out.println(a-b);
        }
        if(op=='*'){
            System.out.println(a*b);
        }
        if(op=='/'){
            System.out.println(a/b);
        }

    }
}
