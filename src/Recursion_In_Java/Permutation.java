package Recursion_In_Java;

public class Permutation {
    public static void main(String[] args) {
        String s="abcd";
        printPermutation("",s);
    }
    public static void printPermutation(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            printPermutation(ans+ch,left+right);

        }
    }
}
