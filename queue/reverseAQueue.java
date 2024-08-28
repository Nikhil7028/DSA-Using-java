package queue;
import java.util.LinkedList;
import java.util.Queue;
// Reverse first k elements of a queue
// q=[1,2,3,4,5,6]   k=3
// After reverse
// q=[4,5,6,1,2,3]
public class reverseAQueue {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Queue q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        
        System.out.println(q);
        int k=7;

        for (int i = 0; i < k; i++) 
            q.add(q.remove());
            
        System.out.println(q);
        
    }
    
}
