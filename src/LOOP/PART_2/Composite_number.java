package LOOP.PART_2;

import java.util.Scanner;

public class Composite_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number  ");
        int n = scan.nextInt();
        for(int i=2;i<=n-1;i++){

            if(n%i==0){
                System.out.println("composite number ");
                break;
            }

        }
    }
}
