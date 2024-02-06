package StringAndStringBuilders;

import java.util.Scanner;

public class Reverse_substring {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        //System.out.print("Enter the String   ");
        //String s=sc.nextLine();
        StringBuilder sb =new StringBuilder("i am saquib anjum");
        System.out.println(sb);

        int n=sb.length();
        int i=0;
     int j=0;
     while(j<n) {
         if (sb.charAt(j) != ' ') j++;


         else {
             reverse(i,j-1,sb);
             i=j+1;
             j=i;
         }

     }
        reverse(i,j-1,sb);
        System.out.println(sb);
    }
    public static void reverse(int i, int j, StringBuilder sb){
      //  int n=sb.length();
//        int i=p;
//        int j=q-1;
        while(i<=j){
            char temp=sb.charAt(i); // use a char variable to store the temporary character
            sb.setCharAt(i, sb.charAt(j)); // pass the index and the new character
            sb.setCharAt(j, temp); // use parentheses to enclose the expressions

            i++;
            j--;
        } //return sb;
    }
}
