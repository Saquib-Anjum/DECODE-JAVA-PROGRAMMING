package LINKED_LIST.PART_3;

class dNode{
    dNode next;
    dNode prev;
    int val;
    dNode(int val){
        this.val=val;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
       dNode a= new dNode(10);
        dNode b= new dNode(20);
        dNode c= new dNode(30);
        dNode d= new dNode(40);
        dNode e= new dNode(50);
        dNode f= new dNode(60);
        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        e.next = f;
        f.prev = e;

        print(f);

    }
    public static void print(dNode head){
     dNode temp =head;
     while(temp !=null){
         System.out.print(temp.val +"  ");
         temp=temp.prev;
     }
        System.out.println();
    }

}
