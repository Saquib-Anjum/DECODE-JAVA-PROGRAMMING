package StringAndStringBuilders;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String   ");
        String s=sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        System.out.println(sb);

        int n=sb.length();
        int i=0;
        int j=n-1;
        while(i<j){
            char temp=sb.charAt(i); // use a char variable to store the temporary character
            sb.setCharAt(i, sb.charAt(j)); // pass the index and the new character
            sb.setCharAt(j, temp); // use parentheses to enclose the expressions

            i++;
            j--;
        }
        System.out.println(sb);





    }
}
