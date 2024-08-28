package queue;
class Node{
    public int val;
    public Node next;
    Node(int val){
        this.val=val;
    }
}
class queuell{
    Node head;
    Node tail;
    int size=0;
    void add(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
    int peek(){
        if (size==0) {
            System.out.println("Queue is empty ");
            return -1;
        }
        return head.val;
    }
    int remove(){
        if (size==0) {
            System.out.println("Queue is empty ");
            return -1;
        }
        int x=head.val;
        head=head.next;
        size--;
        return x;
    }
    void diplay(){
        Node temp=head;
        while (temp !=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;            
        }
        System.out.println();
    }
    boolean isEmpty(){
        if (size==0)
            return true;
        return false;
    }
    
}

public class LLimplementation {
    public static void main(String[] args) {
        queuell q=new queuell();
        
        System.out.println("queue is empty "+q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.diplay();
        System.out.println("Remove:: "+q.remove());
        System.out.println("Front element: "+q.peek());
        // q.clear();  //it will clear the queue
        q.diplay();
        System.out.println("Size:: "+q.size);
        System.out.println(q.remove());
        q.diplay();
        System.out.println("Front element: "+q.peek());
        System.out.println("queue is empty "+q.isEmpty());
        
    }
    
}
