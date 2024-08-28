package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelTraversal {
    static void print(Node root){
        if (root==null){
            System.out.println("queue is empty");            
            return;
        }
        Queue<Node> q= new LinkedList<>();
        
        System.out.println(root.val+" ");
        if(root.left !=null) q.add(root.left);
        if(root.right !=null) q.add(root.right);        
        

        while (q.size()>0) {
            root=q.poll();
            System.out.print(root.val+" ");
            if(root.left !=null) q.add(root.left);
            if(root.right !=null) q.add(root.right);
            root=root.left;    
            System.out.println();        
        }


    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left=b;   a.right=c;
        b.left=d;   b.right=e;
        c.left=f;   c.right=g;

        print(a);
    }

    
}
