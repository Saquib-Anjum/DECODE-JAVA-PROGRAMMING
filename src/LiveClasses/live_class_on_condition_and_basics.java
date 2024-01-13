package LiveClasses;

import java.util.Scanner;

public class live_class_on_condition_and_basics {
    public static void main(String[] args) {
        class Addition{
             void adding(){
                 Scanner sc = new Scanner(System.in);
                 //taking input as first number
                 System.out.print("Enter the 1st  number  =>");
                 int a = sc.nextInt();
                 //taking input as second number
                 System.out.print("Enter the 2nd number =>");
                 int b = sc.nextInt();
                 // condition

                 if(a>0 || b<100){
                     int result = a+b;
                     System.out.println("sum is  "+result);

                 }
                 else{
                     System.out.println("invalid input");
                 }

             }
        }

        Addition a=new Addition();
        a.adding();


    }
}
