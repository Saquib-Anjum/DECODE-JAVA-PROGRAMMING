package Recursion_In_Java;

public class Skip_Character {
    public static void main(String[] args) {
        String s="Saquibanjum";
        skip(0,s,"");

    }
    public static void skip(int i,String s,String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a') {
            skip(i+1,s,ans+s.charAt(i));
            //ans+=s.charAt(i);

        }
        else{
            skip(i+1,s,ans);
        }
    }
}
