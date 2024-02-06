package StringAndStringBuilders;

public class inBuildFunction {
    public static void main(String[] args) {
        StringBuilder sb  =new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        StringBuilder s  =new StringBuilder("abcdefghijkl");
        System.out.println(sb.compareTo(s));

    }
}
