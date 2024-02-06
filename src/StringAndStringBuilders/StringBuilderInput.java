package StringAndStringBuilders;

import java.util.Scanner;

public class StringBuilderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input of the String        ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(4,'e');
        System.out.println(sb);
    }
}
