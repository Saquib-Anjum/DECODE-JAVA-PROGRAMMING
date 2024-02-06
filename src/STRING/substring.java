package STRING;

public class substring {
    public static void main(String[] args) {
        String s = "Abcdefghi";
        for (int i = 0; i <s.length() ; i++) {
            System.out.println(s.substring(0,i));


        }
        System.out.println("another  ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {

                System.out.println(s.substring(i,j));
            }

        }
    }
}
