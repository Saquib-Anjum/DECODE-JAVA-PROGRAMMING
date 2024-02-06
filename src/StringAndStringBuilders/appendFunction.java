package StringAndStringBuilders;

public class appendFunction {
    public static void main(String[] args) {
        String s=new String("saquib ");
        String t="Anjum";
        System.out.println(s);
        System.out.println(t);
        System.out.println(s+t);

        StringBuilder sb=new StringBuilder("abcdef");
        System.out.println(sb.append("56456"));
        System.out.println(sb.append(s));
    }
}
