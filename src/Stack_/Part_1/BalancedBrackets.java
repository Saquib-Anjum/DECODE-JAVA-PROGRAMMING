
package Stack_.Part_1;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Input is ");
        System.out.println(s);
        boolean flag = isValid(s);
        System.out.println(flag);

    }

    public static boolean isValid(String s) {
        java.util.Stack<Character> st = new java.util.Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                if (st.peek() == '(') st.pop();
            }
        }
        return st.isEmpty();
    }
}
