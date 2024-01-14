package LOOP.PART_1;

import java.util.Scanner;

public class Geometric_progression {

    //display gp 3,12,48........................
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  ");
        int n = sc.nextInt();
        int a=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*4;
        }

    }
}
