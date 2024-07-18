package BinaryTree;

import java.util.Scanner;

public class NthLevelPrinting {
    static int  n;
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
        System.out.println("Enter the level of tree :  ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        NthLevel(a,0);
    }
    public static void NthLevel(Node root,int level){
        if(root==null) return;
        if(level ==n) System.out.print(root.val+" ");
        else System.out.println("Index out of tree  ") ;
        NthLevel(root.left,level+1);
        NthLevel(root.right,level+1);
    }
}
