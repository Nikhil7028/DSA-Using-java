package Linked_List;

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;
    }
}


public class DisplayLinkedlist {
        
    public static void main(String[] args) {
        // Create node
        Node head=new Node(11);
        Node b=new Node(17);
        Node c=new Node(24);
        Node d=new Node(36);
        Node e=new Node(47);
        
        // Linked node 
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        // Displaying the linkedlist
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;            
        }
    }
}
