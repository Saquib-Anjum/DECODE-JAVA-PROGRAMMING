package LINKED_LIST.PART_1;

class SLL{
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void size(){
        System.out.println("length of linked list is  "+size);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp=temp.next;
        }
        System.out.println();
    }


}
public class Implementation {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(34);
        list.insertAtEnd(67);
        list.insertAtEnd(98);
        list.insertAtEnd(76);
        list.display();
        list.size();
        list.insertAtEnd(99);
        list.display();
        list.size();


    }
}
