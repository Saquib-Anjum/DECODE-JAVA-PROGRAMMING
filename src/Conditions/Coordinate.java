package Conditions;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of x coordinate  ");
        int x =scan.nextInt();

        System.out.print  ("Enter the value of y coordinate  ");
        int y  =scan.nextInt();

          if(x==0  &&y==0){
              System.out.println("it lies on the origin");
          }
          else if(x==0&& y>0){
              System.out.println("It lies in X axis");
          }
          else if(y==0  && x>0){
              System.out.println("It lies in Y axis");
          }
          else if(x>0 &&  y>0){
              System.out.println("It lies in first quadrant");
          }
          else if(x<0 &&  y>0){
              System.out.println("It lies in second quadrant");
          }
          else if(x<0 &&  y<0){
              System.out.println("It lies in third quadrant");
          }
          else {
              System.out.println("It lies in fourth quadrant");
          }
    }
}
