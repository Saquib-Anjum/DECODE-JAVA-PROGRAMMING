package Stack.Part_1;

import java.util.Stack;

public class Stack_Intro {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(34);
        st.push(43);
        st.push(70);
        st.push(63);
        st.push(76);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
