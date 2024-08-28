package Linked_List;
// create a linked list by connecting the node and find the tail
public class FindTail_LL {
    public static void show(Node head) {
        while (head !=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();

    }


    public static Node findTail(Node head) {
        if (head== null) 
            return head;       
            while (head.next !=null){
            head=head.next;
        }
        return head;

    }
    public static void main(String[] args) {
        // create list
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(33);
        Node d=new Node(44);
        Node e=new Node(55);
        Node f=new Node(16);
        Node g=new Node(77);
        Node h=new Node(88);
        Node i=new Node(99);
        Node j=new Node(11);

        // connect list
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        show(a);
        Node tail=findTail(a);
        System.out.println("Tail is :: "+tail);
        System.out.println("tail  data :: "+tail.data);
        
    }
    
}
