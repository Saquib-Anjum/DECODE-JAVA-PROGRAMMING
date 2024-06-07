package Queue_;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class IntroductionToQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(23);
        q.add(13);
        q.add(76);
        q.add(71);
        q.add(55);
        q.add(95);
        //printing the entire Queue
        System.out.println("printing the entire Queue  ");
        System.out.println(q);
        //printing the size of Queue
        System.out.println("printing the size of Queue ");
        System.out.println(q.size());
        //removing the first element from the Queue
        System.out.println("removing the first element from the Queue ");
        System.out.println(q.poll());
        System.out.println(q);
        //finding is Queue is empty or not
        System.out.println("Finding that the Queue is empty or not  ");
        System.out.println(q.isEmpty());

    }

}
