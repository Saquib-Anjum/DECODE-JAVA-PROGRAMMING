package Queue_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(23);
        q.add(55);
        q.add(34);
        q.add(61);
        q.add(76);
        System.out.println("Queue is  ");
        System.out.println(q);
        while(q.size()>0){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println("reversed Queue is  ");
        System.out.println(q);

    }
}
