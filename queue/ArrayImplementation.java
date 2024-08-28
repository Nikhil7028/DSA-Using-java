package queue;

class queueA{
    int f=-1;
    int r=-1;    
    int[] arr=new int[7];
    int size=0;

    void add(int val){
        if (f==-1)  f=0;
        if (r>=arr.length-1) {
            System.out.println("Queue is full");
            return;            
        }
        arr[++r]=val;
        size++;
    }
    int remove(){
        if (f==-1 || f>r)  {
            System.out.println("Queue is Empty");
            return -1;            
        }
        int x=arr[f];
        arr[f]=0;
        f++;
        size--;
        return x;
    }
    int peek(){
        if (f==-1 || f>r)  {
            System.out.println("Queue is Empty");
            return -1;            
        }
        return arr[f];
    }
    // size;
    boolean isEmpty(){
        if (f==-1 || f>r) 
            return true;  
        return false;
    }
    void diplay(){
        for (int i = f; i <= r; i++) {
            System.out.print(arr[i]+" ");            
        }
        System.out.println();

    }
    
}

public class ArrayImplementation {
    public static void main(String[] args) {
        queueA q=new queueA();
        
        System.out.println("queue is empty "+q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.diplay();
        System.out.println(q.remove());
        System.out.println("Front element: "+q.peek());
        // q.clear();  //it will clear the queue
        q.diplay();
        System.out.println(q.size);
        System.out.println(q.remove());
        q.diplay();
        System.out.println("Front element: "+q.peek());
        System.out.println("queue is empty "+q.isEmpty());

    }
    
}
