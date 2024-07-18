package BinaryTree;

public class ProductOfNodesOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(54);
        Node c = new Node(3);
        Node d = new Node(56);
        Node  e = new Node(78);
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
        System.out.println(product(a));
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
}
