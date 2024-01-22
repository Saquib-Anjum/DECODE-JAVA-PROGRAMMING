package LOOP.PART_2;

import java.util.Scanner;

public class county_digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number  ");
        long n= scan.nextLong();
        int count= 0;

        while(n!=0){
            n=n/10;
            count++;

        }
        System.out.println(count);
    }
}