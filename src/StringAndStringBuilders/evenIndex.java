package StringAndStringBuilders;

import java.util.Scanner;

public class evenIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String    ");
        String s=sc.nextLine();
        String res="";
        for (int i = 0; i < s.length(); i++) {
               if(i%2==0){
                   res+='a';

               }
               else{
                   res+=s.charAt(i);

               }

        }
        s=res;
        System.out.print(s);
    }
}
