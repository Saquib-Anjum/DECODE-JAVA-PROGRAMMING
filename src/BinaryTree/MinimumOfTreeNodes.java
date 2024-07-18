package BinaryTree;

public class MinimumOfTreeNodes {
    public static void main(String[] args){
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
        System.out.println("Minimum value   ");
        int res=minimum(a);
        System.out.println(res);
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int minimum(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int min= Integer.MAX_VALUE;
        min=Math.min(root.val,Math.min(minimum(root.left),minimum(root.right)));
        return min;
    }
}
