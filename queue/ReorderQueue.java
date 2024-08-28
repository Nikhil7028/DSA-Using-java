package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Reorder queue (Interleave 1st half with 2nd half)
// No. of element is always even
// Input  q:[1,2,3,4,5,6,7,8]
// output q:[1,5,2,6,3,7,4,8]
public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);   q.add(2);
        q.add(3);   q.add(4);
        q.add(5);   q.add(6);
        q.add(7);   q.add(8);
        System.out.println("Input  :"+q);

        Stack<Integer> st=new Stack<>();
        int len=q.size();
        // push half element into stack
        for (int i = 1; i <=(len/2); i++) {
            st.push(q.poll());            
        }
        // pop element from stack and add in queue
        while (st.size()>0) {
            q.add(st.pop());        
        }
        // push half element into stack
        for (int i = 1; i <=(len/2); i++) {
            st.push(q.poll());            
        }
        // pop element from stack and add in queue then add q.pop() one by one
        while (st.size()>0) {
            q.add(st.pop());
            q.add(q.remove());    
        }
        // 84736251
        //Reverse the queue using stack
        for (int i = 0; i < len; i++) {
            st.push(q.remove());             
        }
        while (st.size()>0) {
            q.add(st.pop());            
        }
        System.out.println("Output :"+q);


        
    }
    
}
