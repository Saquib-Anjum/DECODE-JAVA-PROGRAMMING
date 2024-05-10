package Stack.Part_1;

import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(23);
        st.push(54);
        st.push(78);
        st.push(91);
        st.push(54);
        System.out.println("original stack ");
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
         rt.push(x);
         st.pop();

        }
        //System.out.println(rt);
        System.out.println("Copied stack");
        Stack<Integer> res= new Stack<>();
        while(rt.size()>0){
            res.push(rt.pop());
        }
        System.out.println(res);
    }

}
