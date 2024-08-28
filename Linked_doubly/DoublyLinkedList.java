package Linked_doubly;
class Node{
    Node next;
    int val;
    Node pre;
    Node(int val){
        this.val=val;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    int size=0;

    
    //Method 01: add node from head
    public void addHead(int val){
        Node temp=new Node(val);
        if (head==null)
            head=tail=temp;
        else{
            temp.next=head;
            head.pre=temp;
            head=temp;
        }
        size++;
    }
    //Method 02: add node from tail
    public void addTail(int val){
        Node temp=new Node(val);
        if (tail==null) 
            head=tail=temp;  
        else{
            tail.next=temp;
            temp.pre=tail;
            tail=temp;
        }                      
        size++;
    }
    //Method 03: add node at specific index
    public void addAtidx(int idx, int val){
        if (idx<0 || idx>size) {
            System.out.println("Invalid index :: "+idx);
            return;
        }
        if (idx==0){
            addHead(val);
            return;
        }
        if (idx== size)
            addTail(val);
        else{
            Node temp=new Node(val);
            Node current=head;
            for (int i = 0; i < idx-1; i++) 
                current=current.next;
            Node n=current.next;
            current.next=temp;
            temp.pre=current;
            temp.next=n;
            n.pre=temp;
            size++;
        }
        
    }

    //Method :Delete at head;
    public void deleHead(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        head.pre=null;
        size--;
    }
    //Method :Delete at tail
    public void deleTail(){
        if (tail==null) {
            System.out.println("List is empty");
            return;
        }
        tail=tail.pre;
        tail.next=null;
        size--;
    }

    // Method: delete Node at specific idx
    public void deleAtidx(int idx){
        if (idx<0 || idx>=size) {
            System.out.println("Invalid index :: "+idx);
            return;
        }
        if (idx==0){
            deleHead();
            return;
        }
        if (idx==size-1)
            deleTail();
        else{
            Node current=head;
            for (int i = 0; i < idx-1; i++) 
                current=current.next;
            // Node n=current.next;
            current.next=current.next.next;
            current=current.next;
            current.pre=current.pre.pre;
            size--;
        }
    }
    // get element at specific idx
    public int get(int idx){
        if (idx<0 || idx>=size) {
            System.out.print("Invalid index :: "+idx+" ");
            return -1;
        }
        if (idx==0)
            return head.val;
        if (idx==size-1)
            return tail.val;
        else{
            Node current=head;
            for (int i = 0; i < idx; i++) 
                current=current.next;
            // current.next;
            return current.val;
        }
    }
    
    // set the value at specififc index
    public void set(int idx,int val){
        if (idx<0 || idx>=size) {
            System.out.println("Invalid index :: "+idx+" ");
            return;
        }
        if (idx==0){
            head.val=val;
            return;
        }
        if (idx==size-1){
            tail.val=val;
            return;

        }
            
        else{
            Node current=head;
            for (int i = 0; i < idx; i++) 
                current=current.next;
            // current.next;
            current.val=val;
            
        }
    }
    
    // check the palindrome
    public boolean palindrome(){
        if (head==null) return false;
        Node th=head;
        Node tt=tail;

        while (th !=tt) {
            if (th.val != tt.val) {
                return false;
            }
            th=th.next;
            tt=tt.pre;            
        }
        return true;
    } 



    public void length(){
        System.out.println("Size :: "+size);
    }
    public void print(){
        Node tmp=head;
        System.out.print("Head to tail :: ");
        while (tmp !=null) {
            System.out.print(tmp.val+" ");
            tmp=tmp.next;            
        }
        System.out.println();
    }
    public void display(){
        
        Node tmp=tail;
        System.out.print("Tail to Head :: ");
        while (tmp !=null) {
            System.out.print(tmp.val+" ");
            tmp=tmp.pre;            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        // // add from head 
        // list.addHead(10);
        // list.addHead(20);
        // list.addHead(30);
        // list.addHead(40);
        // list.addHead(50);
        // list.addHead(60);
        // list.print(); // Head to tail
        // list.display(); // tail to head
        // list.length();

        //add node from tail
        // list.addTail(11);
        // list.addTail(21);
        // list.addTail(31);
        // list.addTail(41);
        // list.addTail(51);
        // list.print(); // Head to tail
        // list.length();

        //Add Node at specific index
        // list.addAtidx(0,9);
        // list.addAtidx(1,19);
        // list.addAtidx(7,29);
        // list.print(); // Head to tail
        // list.length();

        // delete head and tail
        // list.deleHead();
        // list.print();
        // list.deleTail();
        // list.print();

        // delete node at specific index
        // list.deleAtidx(-1);
        // list.deleAtidx(0);
        // list.deleAtidx(1);
        // list.deleAtidx(6);
        // list.deleAtidx(5);
        // list.print(); // Head to tail
        // list.length();

        // get element from spcific idx base 0
        // System.out.println("Element is  "+list.get(0));
        // System.out.println("Element is "+list.get(-1));
        // System.out.println("Element is "+list.get(7));
        // System.out.println("Element is "+list.get(8));

        // set or update the val of specific Node by using idx
       
        // list.set(0,14);
        // list.set(1,24);
        // // list.set(-1,34);
        // // list.set(8,44);
        // list.set(7,54);
        // list.set(2,64);
        // list.print();

        list.addHead(10);
        list.addHead(20);
        // list.addHead(30);
        list.addHead(30);
        list.addHead(20);
        list.addHead(10);
        list.print();
        if(list.palindrome())
            System.out.println("Given list is palindrome");
        else
            System.out.println("List is not palindrome");
    }

    
}
