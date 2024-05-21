package Stack_.Part_1;

import java.util.Stack;

public class DisplayIndex {
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
//        System.out.println("Stack is  ");
//        System.out.println(st);
//        System.out.println("Last element of stack");
//        System.out.println(st.peek());


        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println("reverse stack is   ");
        System.out.println(rt);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("Again st stack is  ");
        System.out.println(st);
        int n = st.size();
       int[] arr = new int[n];
        System.out.println("looped stack is  ");
        for (int i = n-1; i >=0 ; i--) {
          int x  = st.pop();
          arr[i]= x;

        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
            st.push(arr[i]);

        }
        System.out.println("After the loop stack is    ");
        System.out.println(st);
    }
}
