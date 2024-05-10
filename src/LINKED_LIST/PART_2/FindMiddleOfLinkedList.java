package LINKED_LIST.PART_2;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }

}
class insertNode{
    Node head;
    Node tail;
    void insertAtHead(int val){

        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }

    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail= temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //finding the middle of linkedList
    public static Node MiddleLL(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null  && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

public class FindMiddleOfLinkedList {
    public static void main(String[] args){
    insertNode list = new insertNode();
//        list.insertAtHead(10);
//        list.insertAtHead(10);
//        list.insertAtHead(30);
//        list.insertAtHead(34);
//        list.insertAtHead(54);
//        list.insertAtHead(45);
//        list.insertAtHead(22);
//        list.insertAtHead(95);
        list.insertAtTail(23);
        list.insertAtTail(45);
        list.insertAtTail(65);
        list.insertAtTail(89);
        list.insertAtTail(43);
        list.insertAtTail(23);
        list.insertAtTail(11);
        list.Display();
        System.out.println(list.head.val);
        // Call MiddleLL method to find the middle node
        Node middleNode = insertNode.MiddleLL(list.head);

        // Print the value of the middle node
        System.out.println("Middle node value: " + middleNode.val);

    }
}
