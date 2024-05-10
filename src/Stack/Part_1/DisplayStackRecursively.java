package Stack.Part_1;

import java.util.Stack;

public class DisplayStackRecursively {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();

        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(23);
        st.push(98);
        st.push(76);
        st.push(45);
        st.push(96);
        st.push(52);
        System.out.println("original stack is  ");
        System.out.println(st);
        System.out.println(" Display reverse  recursively   ");
        displayReverseRec(st);
        System.out.println(" Display  recursively   ");
        displayRec(st);
    }
}
