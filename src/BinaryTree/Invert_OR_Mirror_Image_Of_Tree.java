package BinaryTree;

public class Invert_OR_Mirror_Image_Of_Tree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node  e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        //Node h = new Node(91);
        //1*54*3*56*78*21*13
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        display(a);

    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        swap(root.left,root.right);
        display(root.right);
        display(root.left);
    }
    public static void swap(Node i,Node j){
        Node temp= i;
        i=j;
        j=temp;
    }
}
