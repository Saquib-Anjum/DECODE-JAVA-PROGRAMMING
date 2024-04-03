package LINKED_LIST.PART_1;

// Node1 class definition
class Node1 {
    int val;
    Node1 next;

    public Node1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PrintLinkedListRecursively {
    public static void main(String[] args) {
        // Creating nodes for the linked list
        Node1 a = new Node1(23);
        Node1 b = new Node1(63);
        Node1 c = new Node1(78);
        Node1 d = new Node1(56);
        Node1 e = new Node1(98);
        Node1 f = new Node1(98);

        // Constructing the linked list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Displaying the linked list recursively
        displayRecursively(a);
    }

    // Method to display the linked list recursively
    public static void displayRecursively(Node1 head) {
        if (head == null) return;
        System.out.println(head.val);
        displayRecursively(head.next);
    }
}
