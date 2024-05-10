package LINKED_LIST.PART_1;
class InsertAtBeginning{
    Node head;
    Node tail;
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;

              head=temp;
        }
    }
    void display(){
        Node temp=head;

     while(temp!=null){
         System.out.print(temp.val+"  ");
         temp=temp.next;
     }

    }

}
public class InsertAtHead {
    public static void main(String[] args) {
InsertAtBeginning list=new InsertAtBeginning();
        list.insertAtHead(10);
        list.insertAtHead(33);
        list.insertAtHead(45);
        list.insertAtHead(91);
        list.insertAtHead(90);
        list.display();
        list.insertAtHead(10);
        list.display();
    }
}
