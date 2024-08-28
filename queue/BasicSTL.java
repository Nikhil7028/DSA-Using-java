package queue;
import java.util.*;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println("queue is empty "+q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println("Front element: "+q.element());
        // q.clear();  //it will clear the queue
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("Front element: "+q.peek());
        System.out.println("queue is empty "+q.isEmpty());


        

    }
    
}
