package LOOP.PART_1;

import java.util.Scanner;

public class Ap_of_4_6_8__ {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("enter your number    ");
        int n = sc.nextInt();
        for(int i= 4; i<=(3*n)+1;i=i+3)
        {
            System.out.println(i);
        }
    }
}
