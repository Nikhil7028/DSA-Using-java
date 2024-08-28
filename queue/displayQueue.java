package queue;

import java.util.LinkedList;
import java.util.Queue;
// print all the element present in given queue only using add()
// remove(), peek(), size(), and extra queue

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        Queue<Integer> copy=new LinkedList<>();

        while (q.size()>0) {
            System.out.print(q.peek()+" ");
            copy.add(q.remove());            
        }
        System.out.println();
        while (copy.size()>0) 
            q.add(copy.remove());    
        System.out.println(q);        
        
    }
    
}
