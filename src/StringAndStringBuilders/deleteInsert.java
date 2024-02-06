package StringAndStringBuilders;

public class deleteInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("asbsdhgfsd");
        System.out.println(sb);
        sb.deleteCharAt(3);
        sb.delete(1,6);
        sb.append("wesgfhd");
        System.out.println(sb);
        sb.insert(4,"daqeuib");

        System.out.println(sb);
    }
}
