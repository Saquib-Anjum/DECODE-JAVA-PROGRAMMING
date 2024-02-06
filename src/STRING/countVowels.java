package STRING;

public class countVowels {
    public static void main(String[] args) {
        String str = "Saquib Anjum";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(isvowel(ch)==true) count++;
        }
        System.out.println(count);
    }
    public static boolean isvowel(char ch){
        if(ch=='a'||ch=='A')
            return true;
        if(ch=='e'||ch=='E')
            return true;
        if(ch=='i'||ch=='I')
            return true;
        if(ch=='o'||ch=='O')
            return true;
        if(ch=='u'||ch=='U')
            return true;
      return false;
    }
}
