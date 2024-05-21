package Stack_.Part_1;

import java.util.Stack;
import java.util.Scanner;

public class RemoveFromBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the size of Stack   ");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter the element of Stack of  "+i+"  index  ");
            int x=sc.nextInt();
            st.push(x);

        }
        System.out.println();
        System.out.println("Stack is  ");
        System.out.println(st);
        Stack<Integer> rt  = new Stack<>();
        //inserting reversed element
        while(st.size()>1){
            rt.push(st.pop());
        }
        //removing bottom element
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println();
        System.out.println("After the removing the bottom ");
        System.out.println(st);
    }
}
