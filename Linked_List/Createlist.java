package Linked_List;

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
    }
}

public class Createlist {
    public static void main(String[] args) {
        // Create node
        Node a=new Node(10);
        Node b=new Node(26);
        Node c=new Node(37);
        Node d=new Node(48);
        Node e=new Node(59);

        // Linked node 
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // print
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        System.out.println(e.next);
        

    }
    
    
}
