package LINKED_LIST.PART_1;
 class SLLDeleteAtIndex {
     Node head;
     Node tail;
     public int size;
     //inserting at end position means  starting with 10 :- 10-> 12->34->  -:
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
     //for inserting the element at the head  569<-56<-10  starting with 10
     void insertAtHead(int val){
         Node temp=new Node(val);
         if(head==null) head=tail=temp;
         else{
             temp.next=head;
             head=temp;
         }
         size++;
     }
     //insert the element ast any position
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
     //get the element from specific position
     int getELEMENT(int idx) throws Error {
         if (idx == size - 1) return tail.val;
         if (idx >= size || idx < 0) {
             System.out.println("Invalid element  ");
             throw new Error("bhai error ");

         }
         Node temp=head;
         for( int i=1;i<=idx;i++){
             temp=temp.next;
         }
         return temp.val;
     }
     //delete At any index
     void deleteAtHead() throws Error{
         if(head==null) throw new Error("List is Empty  ");
         head=head.next;
         size--;
     }
     //delete at any index
     void delete(int idx){
         if(head==null) throw new Error("List is Empty  ");
         if(idx<0 ||idx>=size){
             throw new Error("Invalid index "  )    ;
         }
         Node temp=head;
         for (int i = 1; i <=idx-1 ; i++) {
             temp=temp.next;

         }
         temp.next=temp.next.next;
         if(temp.next==tail) tail=temp;

       size--;
     }


     //this function will display the element
     void display(){
         Node temp=head;

         while(temp!=null){
             System.out.print(temp.val+"  ");
             temp=temp.next;
         }
     }
     //method for the size
     void size(){
         System.out.println();
         System.out.println("Size of the LinkedList is    "+size);
         System.out.println();
     }

}
public class DeleteAtIndex {
    public static void main(String[] args) {
        SLLDeleteAtIndex list=new SLLDeleteAtIndex();
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
        System.out.println();
        System.out.println( "Index element  "+list.getELEMENT(2));
        list.deleteAtHead();
        list.display();
        list.size();
        list.delete(3);
        list.display();
        list.size();
        System.out.println(list.tail.val);
        System.out.println(list.head.val);
        list.deleteAtHead();
        list.display();
        System.out.println(list.head.val);

        System.out.println(list.tail.val);
        System.out.println(list.head.val);

    }
}
