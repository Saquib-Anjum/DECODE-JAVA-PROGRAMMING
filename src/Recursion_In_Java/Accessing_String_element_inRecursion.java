package Recursion_In_Java;

public class Accessing_String_element_inRecursion {
    public static void main(String[] args) {
        String s="SaquibAnjum";
        print(0,s);
    }
    public static void print(int i,String s){
        if(i==s.length()) return;
        System.out.print(s.charAt(i)+" ");
        print(i+1,s);
    }

}
