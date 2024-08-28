// stack implementation using linked list

class Node{
    int val;
    public Node next;
    Node(int val){
        this.val=val;
    }
}


class Stack{
    Node head;
    Node tail;
    int size=0;
    public Stack(int i) {
        //TODO Auto-generated constructor stub
    }

    public void push(int ele){
        Node temp=new Node(ele);
        size+=1;
        if (head==null && tail==null) {
            head=tail=temp;
            return;            
        } 
        tail.next=temp;
        tail=temp;


    }

    void diplay(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;            
        }   
        System.out.println();    
    }
    
    int peek(){
        if (tail == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return tail.val;
        
    }
    int pop(){
        
        if (size==0) {
            System.out.println("Stack is empty");   
            return -1;         
        }
        else if (head==tail) {
            int x=tail.val;
            head=tail=null;
            size=0;
            return x;            
        }
        Node tp=head;
        while (tp!=null && tp.next !=tail) 
            tp=tp.next;            
        int e=tail.val;
        tail=tp;
        tail.next=null;
        size--;
        return e;
    }
    boolean isEmpty(){
        if(head==null)
            return true;
        return false;
    }
    int size(){
        return size;
    }
}
public class LinkedListImplementation{
    public static void main(String[] args) {
        
		// Initializing String
		String Str = new String("Welcome to geeksforgeeks");

		// using substring() to extract substring
		// returns (whiteSpace)geeksforgeeks

		System.out.print("The extracted substring is : ");
		System.out.println(Str.substring(0,Str.length()-2));
        
        // Stackl st=new Stackl();
        // System.out.println("Stack is empty : "+st.isEmpty());
        // System.out.println("size:: "+st.size());
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // System.out.println("size:: "+st.size());
        // st.push(40);
        // st.push(50);
        // st.diplay();
        // System.out.println("Top:: "+st.peek());
        // System.out.println("pop element: "+st.pop());
        // System.out.println("pop element: "+st.pop());
        // System.out.println("pop element: "+st.pop());
        // System.out.println("Stack is empty : "+st.isEmpty());
        // System.out.println("pop element: "+st.pop());
        // System.out.println("pop element: "+st.pop());
        // System.out.println("pop element: "+st.pop());
        // System.out.println("Top:: "+st.peek());
        // st.diplay();
        // System.out.println("Stack is empty : "+st.isEmpty());
        // System.out.println("size:: "+st.size());
        
        
        Stack st=new Stack(5);
        
        System.out.println("Stack is empty : "+st.isEmpty());
        System.out.println("size:: "+st.size());
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("size:: "+st.size());
        st.push(40);
        st.push(50);
        st.diplay();
        System.out.println("Top:: "+st.peek());
        st.diplay();
        st.pop();
        st.pop();
        System.out.println("Top:: "+st.peek());
        st.diplay();
        System.out.println("Stack is empty : "+st.isEmpty());
        System.out.println("size:: "+st.size());
    }
    
}
