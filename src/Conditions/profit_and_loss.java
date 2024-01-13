package Conditions;

import java.util.Scanner;

public class profit_and_loss {
    public static void main(String[] args) {

        //this is question
        /* cost price is an input through the keyboard
        write a program to determine weather
        the seller has made
        profit or incurred loss or no profit no loss.
        Also determine how much profit he made or loss he incurred
        */

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your coast price  :   ");
        double cp = scan.nextDouble();
        System.out.print("Enter your selling price :   ");
        double sp =scan.nextDouble();

        if(cp<sp){
            System.out.print("He made profit  ");
            System.out.println("And profit is   100"+(sp-cp));

        }
        if(cp==sp){
            System.out.println("No profit and No loss");
        }
        if(cp>sp){
            System.out.println("loss  loss is"+(cp-sp));

        }

    }
}
