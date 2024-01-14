package LOOP.PART_2;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number  ");
        int n = scan.nextInt();
        int x=0;
        for(int i=2;i<=n-1;i++){

            if(n%i==0){
                System.out.println("composite number ");
                x=1;
                break;
            }

        }
        if(n==1){
            System.out.println(" nither prime nor composite");
        }
        else if(x==0){
            System.out.println("prime number");
        }
    }
}
