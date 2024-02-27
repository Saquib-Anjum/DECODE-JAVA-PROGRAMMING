package Recursion_In_Java;

import java.util.Scanner;

public class power_Logarithmic {

        public static int pow(int a,int b) {
            if(b==0) return 1;
            int power=pow(a,b/2);
            if(b%2==0) return power*power;
            else return power*power*a;

        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base  ");
        int a=sc.nextInt();
        System.out.print("Enter the power  ");
        int b=sc.nextInt();
        int res=pow(a,b);
        System.out.println(a+"  raised to the power "+b+" is "+res);

    }
}
