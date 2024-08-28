package queue;

import java.util.Deque;
import java.util.LinkedList;

// Double ended queue in java collection
public class deque {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Deque dq=new LinkedList<>();
        System.out.println("queue is empty "+dq.isEmpty());
        dq.add(11);
        dq.add(10);
        dq.addFirst(1);
        dq.addLast(20);
        dq.add(10);
        dq.addFirst(1);
        dq.addLast(20);
        dq.removeFirst();
        dq.removeLastOccurrence(10);
        System.out.println(dq);
        // q.add(50);
        // q.add(60);
        // System.out.println(q);
        // System.out.println(q.remove());
        // System.out.println("Front element: "+q.element());
        // // q.clear();  //it will clear the queue
        // System.out.println(q);
        // System.out.println(q.size());
        // System.out.println(q.poll());
        // System.out.println(q);
        // System.out.println("Front element: "+q.peek());
        // System.out.println("queue is empty "+q.isEmpty());
        
    }
    
}
