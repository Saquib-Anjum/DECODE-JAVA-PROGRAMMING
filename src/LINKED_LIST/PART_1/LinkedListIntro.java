package LINKED_LIST.PART_1;

public class LinkedListIntro {

        public static void main(String[] args) {
            Node a=new Node(10);
            Node b=new Node(20);
            Node c=new Node(30);
            Node d=new Node(40);
            Node e=new Node(50);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=null;
            Node temp=a;
            //printing the linkedList
//        System.out.println(a.val);
//        System.out.println(b.val);
//        System.out.println(c.val);
//        System.out.println(d.val);
//        System.out.println(e.val);
            for (int i = 0; i < 5; i++) {
                System.out.println(temp.val);
                temp=temp.next;
            }

        }
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }


