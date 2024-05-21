package Stack_.Part_1;

public class pushAtBottom {
    public static void insertAtBottom(Stack st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
    int top = st.pop();

    insertAtBottom(st,x);
        //System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack st =new Stack();
        st.push(23);
        st.push(45);
        st.push(95);
        st.push(81);
        st.push(44);
        st.push(99);
        st.push(32);
        System.out.println("Original Stack");
        System.out.println(st);
        insertAtBottom(st,120);
        System.out.println();
        System.out.println(st);

    }
}
