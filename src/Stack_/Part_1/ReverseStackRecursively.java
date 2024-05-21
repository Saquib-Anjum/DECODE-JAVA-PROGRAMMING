package Stack_.Part_1;

import java.util.Stack;

public class ReverseStackRecursively {
    public static void main(String[] args) {
         Stack <Integer> st  = new Stack<>();
        st.push(23);
        st.push(55);
        st.push(81);
        st.push(86);
        st.push(97);
        st.push(11);
        st.push(88);
        System.out.println("Original Stack is  ");
        System.out.println(st);
        System.out.println();
        reverse(st);
        System.out.println("reversed stack is ");
        System.out.println(st);

    }

    public static void reverse(Stack<Integer> st){
        if(st.size() ==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(top,st);

    }
    public static void pushAtBottom(int x , Stack<Integer> st){
     Stack<Integer> rt = new Stack<>();
     while(st.size()>0){
         rt.push(st.pop());
     }
     st.push(x);
     while(rt.size()>0){
         st.push(rt.pop());
     }

    }
}
