package LINKED_LIST.PART_1;

class SLLInsertAtAnyPosition{
    Node head;
    Node tail;
    public int size;
    void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("invalid index  ");
        }
        Node temp=new Node(val);
        Node x=head;
        for (int i = 1; i <=idx-1 ; i++) {
            x=x.next;

        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
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
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp=temp.next;
        }

    }
}
public class InsertMethod {
    public static void main(String[] args) {
        SLLInsertAtAnyPosition list=new SLLInsertAtAnyPosition();
        list.insertAtHead(10);
        list.insertAtHead(55);
        list.insertAtHead(15);
        list.insertAtHead(45);
        list.insertAtHead(90);
        list.insertAtHead(40);
        list.display();
        list.insertAtEnd(22);
        list.display();
        System.out.println();
        System.out.println(list.size);
        list.insert(4,190);
        list.display();

    }
}
