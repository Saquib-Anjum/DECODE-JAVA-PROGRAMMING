package Stack_.Part_1;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LLStack{
    Node head;
    Node tail;
    int size = 0;
    void push(int x) {
        Node temp = new Node(x);
        temp.next=head;
        head =temp;
        size++;
    }
    void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int pop(){
        Node temp = head;
        int top = head.val;
        head=head.next;
        size--;
        return top;
    }
    int peek(){
        Node temp  = head;
        if(temp==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }
    boolean isEmpty(){
        Node temp = head;
        if(temp==null) return true;
        return false;

    }
//   boolean isFull(){
//        Node temp = head;
//        if()
//   }
   int size(){
        return size;
   }
}

public class LinkedListImplementationInStack {
    public static void main(String[] args) {
        LLStack st  = new LLStack();
        st.push(10);
        st.push(34);
        st.push(58);
        st.push(20);
        st.push(91);
        st.push(54);
        st.push(85);
        st.push(12);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}
