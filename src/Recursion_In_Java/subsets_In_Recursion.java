package Recursion_In_Java;

import java.util.ArrayList;

public class subsets_In_Recursion {
    static ArrayList<String> arr=new ArrayList<>();
    public static void main(String[] args) {
        String s ="abcd";
        printSubsets(0,s,"");
        System.out.print(arr+" ");
    }
    public static void printSubsets(int i,String s,String res){
        if(i==s.length()){
            arr.add(res);
           // System.out.print(res+"  ");
            return;
        }
        char ch=s.charAt(i);
        printSubsets(i+1,s,res+ch);//take
        printSubsets(i+1,s,res);//skip
    }
}
