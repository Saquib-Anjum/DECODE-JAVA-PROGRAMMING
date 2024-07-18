package BinaryTree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;

    }
}
public class intro {
    public static void main(String[] args) {
       Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(95);
        a.left=b; a.right=c;
        b.left=d; b.right = e;
        c.right=f; c.left=g;
        display(a);

    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);//left Node .
        display(root.right);
    }
}
