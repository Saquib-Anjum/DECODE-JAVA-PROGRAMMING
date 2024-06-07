package Queue_;
import java.util.*;
public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> qu =  new LinkedList<>();
        qu.add(12);
        qu.add(56);
        qu.add(76);
        qu.add(54);
        qu.add(89);
        qu.add(90);
        Queue<Integer> qt = new ArrayDeque<>();
        System.out.println("printing queue  ");
         while(qu.size()>0){
             System.out.print(qu.peek()+" ");
             qt.add(qu.poll());
         }
         while(qt.size()>0){
             qu.add(qt.poll());
         }
        System.out.println();
        System.out.println("again printing queue");
        System.out.println(qu);

    }
}
