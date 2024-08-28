package queue;
// Implementation of circular queue using Array
//  | | | | | | | |
class CqueueA{
    int f=-1;
    int r=-1;    
    int[] arr=new int[7];
    int size=0;

    void add(int val){
        if (size==arr.length) {
            System.out.println("Queue is full ");
            return;            
        }
        if (f==-1) {
            f=0;
            arr[++r]=val;            
        }
        else if(r<arr.length-1){            
            arr[++r]=val;  
        }
        else if(size<arr.length && r==arr.length-1){
            r=0;
            arr[r]=val;
        }
        size++;

        
    }
    int remove(){
        if (size==0)  {
            System.out.println("Queue is Empty");
            return -1;            
        }
        
                
        if (f<arr.length) 
        {           
            int x=arr[f];
            arr[f]=0;
            f++;
            if(f==arr.length) f=0;
            size--;
            return x;
        }
        // else if(f==arr.length){
            
        //     f=0;
        //     int x=arr[f];
        //     arr[f]=0;
        //     f++;
        //     size--;
        //     return x;
        // }
        return -1;
        
    }
    int peek(){
        if (f==-1 || size==0)  {
            System.out.println("Queue is Empty");
            return -1;            
        }
        return arr[f];
        
    }
    // size;
    boolean isEmpty(){
        if (size==0 || f==-1) 
            return true;
        return false;
        
    }
    void diplay(){
        if (f==-1) {
            System.out.println("[]");
            return;            
        }
        if (f<=r) {
            for (int i = f; i <=r; i++) 
                System.out.print(arr[i]+" ");  
            System.out.println();  
            
        }
        else{
            for (int i = f; i <arr.length; i++) 
                System.out.print(arr[i]+" "); 
            for (int i = 0; i <=r; i++) 
                System.out.print(arr[i]+" "); 
            System.out.println();    
            

        }
       
        

    }
    void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        
    }
    
    
}

public class CircularQueueArray {
    public static void main(String[] args) {
        
        CqueueA q=new CqueueA();//queueA();
        System.out.println("queue is empty "+q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);        
        System.out.println("size : "+q.size);
        System.out.println("Remove:: "+q.remove());
        q.add(80);
        System.out.println("Remove:: "+q.remove());
        System.out.println("Remove:: "+q.remove());

        q.add(90);
        System.out.println("size : "+q.size);
        System.out.println("font : "+q.f);
        System.out.println("size : "+q.size);


        // System.out.println("Front element: "+q.peek());
        // q.clear();  //it will clear the queue
        // q.print();
        // System.out.println("size : "+q.size);
        // q.print();

        // System.out.println(q.remove());
        q.diplay();
        System.out.println("Front element: "+q.peek());
        // System.out.println("queue is empty "+q.isEmpty());
        q.print();
       
        
    }

    
}
