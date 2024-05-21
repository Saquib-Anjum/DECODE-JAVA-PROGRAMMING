package Stack_.Part_1;
import java.util.Stack;
public class InsertAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(87);
        st.push(98);
        st.push(25);
        st.push(90);
        System.out.println("original stack   ");
        System.out.println(st);
        //number that we want to add
        int n=100;
        //At this index
        int idx = 4;
        Stack <Integer> rt  =new Stack <>();
        while(st.size()>idx){
            rt.push(st.pop());

        }
        System.out.println(st);
        System.out.println("another stack  ");
        System.out.println(rt);
        System.out.println();
        rt.push(n);
        System.out.println(rt);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("Stack after insertion   ");
        System.out.println(st);

    }
}
