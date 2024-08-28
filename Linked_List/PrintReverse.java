package Linked_List;
// Question print the linkedlist in reverse 

// Node class is written in another file we can access anywhere in the package

public class PrintReverse {
    public static void print(Node h){
        // Node temp=h;
        if (h == null) 
            return;
        // print by using the recurvice function
        print(h.next); 
        System.out.print(h.data+" ");
                       
        

    }
    public static void main(String[] args) {
        // Create node
        Node a=new Node(11);
        Node b=new Node(17);
        Node c=new Node(24);
        Node d=new Node(36);
        Node e=new Node(47);
        
        // Linked node 
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // Displaying the linkedlist
        print(a);
        
    }
    
}
