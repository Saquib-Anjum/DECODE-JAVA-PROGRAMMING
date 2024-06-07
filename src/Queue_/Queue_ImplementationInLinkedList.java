package Queue_;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        Node next = null;
    }
}
class LLImplementationInQueue{
    Node tail;
    Node head;
    int size =0;
    //adding the element
    void add(int x){
        Node temp = new Node(x);
        if(head==null) head = tail =temp;
        else{
          tail.next=temp;
            tail=temp;
            size++;
        }
    }
    //removing  the element
    int poll(){
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    int peek(){
        return head.val;
    }
    boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    //display
    void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }


}
public class Queue_ImplementationInLinkedList {
    public static void main(String[] args) {
     LLImplementationInQueue q = new LLImplementationInQueue();
     q.add(56);
     q.add(87);
     q.add(89);
     q.add(54);
     q.display();
    }
}
