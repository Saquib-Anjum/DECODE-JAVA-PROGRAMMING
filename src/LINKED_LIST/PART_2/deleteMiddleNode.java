package LINKED_LIST.PART_2;

class DeleteNode{
    Node tail;
    Node head;
    void InsertTail(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    //Display
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void Delete(Node head){
        //Node temp = new Node(val);
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null  &&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next=slow.next;


    }
}
public class deleteMiddleNode {
    public static void main(String[] args) {
        DeleteNode list = new  DeleteNode();
        list.InsertTail(12);
        list.InsertTail(54);
        list.InsertTail(99);
        list.InsertTail(35);
        list.InsertTail(81);
        list.InsertTail(92);
        list.InsertTail(22);
        list.InsertTail(49);
        list.Display();
        System.out.println();

        list.Delete(list.head);
        list.Display();

    }
}
