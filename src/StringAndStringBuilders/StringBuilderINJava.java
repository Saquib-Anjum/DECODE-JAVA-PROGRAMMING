package StringAndStringBuilders;

public class StringBuilderINJava {
    public static void main(String[] args) {
        String s=new String("abcd");
        //stringbuilder
        System.out.println(s);
        StringBuilder sb= new StringBuilder("qweert");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}

