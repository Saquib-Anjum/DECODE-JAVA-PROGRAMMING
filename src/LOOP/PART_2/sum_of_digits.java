package LOOP.PART_2;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your number  ");
        long n = scan.nextLong();
        int count = 0;
        long sum=0;
        while (n != 0) {
            long a  = n % 10;
            sum=sum+a;
            n=n/10;

        }
        System.out.println(sum);

    }
}