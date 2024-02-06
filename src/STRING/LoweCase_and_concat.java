package STRING;

public class LoweCase_and_concat {
    public static void main(String[] args) {
        String s="SAQUIB ANJUM IS  BAD BOY";
        String a=s.toLowerCase();
        System.out.println(a);
        System.out.println(a.toUpperCase());

        //concat
        String str1="Saquib ";

        String str2="Anjum ";
        System.out.println(str1.concat(str2));
    }
}
