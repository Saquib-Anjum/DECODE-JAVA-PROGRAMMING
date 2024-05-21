package Stack_.part2;

import java.util.*;

public class PreFixToPostFix_conversion {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.println("Prefix is   ");
        System.out.println(str);
        Stack<String> val =new  Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch =str.charAt(i);
            int ascii  = (int)ch;
            if(ascii >=48 &&ascii<=57){
                val.push(ch+"");
            }
            else{
                String v1 =val.pop();
                String v2 = val.pop();
                char op =ch;
                String t = v1+v2+op;
                val.push(t);
            }
        }
        System.out.println("postFix is   ");
        System.out.println(val.peek());

    }
}
