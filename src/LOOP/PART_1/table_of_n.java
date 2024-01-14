package LOOP.PART_1;

import java.util.Scanner;

public class table_of_n {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number    ");
        int n = scan.nextInt();
        for(int i=n;i<=(n*10);i=i+n){
            System.out.println(i);
        }
    }
}
