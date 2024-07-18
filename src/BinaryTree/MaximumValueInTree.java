package BinaryTree;

public class MaximumValueInTree {
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
        display(a);
        System.out.println();
        System.out.println(  maximum(a));
    }

    public static void display(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static int maximum(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        int max= Integer.MIN_VALUE;
                max=Math.max(root.val,Math.max(maximum(root.left),maximum(root.right)));
                return max;
    }
}
