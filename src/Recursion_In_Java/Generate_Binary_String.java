package Recursion_In_Java;

import java.util.Scanner;

public class Generate_Binary_String {
    public static void binaryString(String s,int n){
        int m=s.length();
        if(s.length()==n) {
            System.out.println(s);
            return;
        }
        if(m==0||s.charAt(m-1)=='0'){
            binaryString(s+0,n);
            binaryString(s+'1',n);
        }
        else{
            binaryString(s+'0',n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number   ");
        int n=sc.nextInt();

        String s="";
        binaryString(s,n);
    }
}
