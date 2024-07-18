package BinaryTree;

public class inOrder_postOrder_preOrder {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(54);
        Node c = new Node(3);
        Node d = new Node(56);
        Node  e = new Node(1234);
        Node f = new Node(21);
        Node g = new Node(13);
        //Node h = new Node(91);
        //1*54*3*56*78*21*13
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=g;
        c.right=f;
        System.out.println("InOrder ");
        inOrder(a);
        System.out.println();
        System.out.println("PreOrder");
        preOrder(a);
        System.out.println();
        System.out.println("PostOrder");
        postOrder(a);
    }
    public static void inOrder(Node root){
    if(root==null) return;
    inOrder(root.left);
     System.out.print(root.val+" ");
     inOrder(root.right);
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);

        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);

        postOrder(root.right);
        System.out.print(root.val+" ");
    }
}
