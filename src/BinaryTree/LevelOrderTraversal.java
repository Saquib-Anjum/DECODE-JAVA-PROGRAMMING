package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {
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
        DisplayLevelOrder(a);
        System.out.println();
        System.out.println("reverse  ");
        ReverseDisplayLevelOrder(a);

    }

    private static void ReverseDisplayLevelOrder(Node root) {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");

            if(temp.right != null) q.add(temp.right);
            if(temp.left != null) q.add(temp.left);
        }

    }
    private static void DisplayLevelOrder(Node root) {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }

    }

}
