package queue;
// Linked list implementation of circular linked list
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
            tail.next=head;
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
        tail.next=head;
        size--;
        return x;
    }
    void diplay(){
        Node temp=head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.val);
            temp=temp.next;            
        }
    }
    boolean isEmpty(){
        if (size==0)
            return true;
        return false;
    }
    
}
public class CircularQueueLL {
    public static void main(String[] args) {
        
        queuell q=new queuell();
        
        System.out.println("queue is empty "+q.isEmpty());
        q.add(10);        q.add(20);
        q.add(30);        q.add(40);
        q.add(50);        q.add(60);
        q.add(70);        q.add(80);
        q.add(90);        q.add(100);
        q.add(120);
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
