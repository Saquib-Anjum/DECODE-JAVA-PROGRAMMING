package StringAndStringBuilders;

import java.util.Scanner;

public class lowercase_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string   ");
        String s =sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb);
        for(int i=0;i<sb.length();i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 65 && ascii <= 90) {
                ascii = ascii + 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);

            }
            else if (ascii >= 97 && ascii <= 122) {
                ascii = ascii - 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);

            }
        }

        System.out.println(sb);
    }
}
