// package stack;
// implement stack using array
class Stack{
    int idx=0;
    int[] arr;
    Stack(int size){
        arr=new int[size]; 
    }
    public void push(int ele){
        if(arr.length<=idx){
            System.out.println("Stack is Overflow");
            return;
        }
        arr[idx++]=ele;
    }
    void diplay(){
        for (int i=0;i<idx;i++) 
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    int peek(){
        if (idx==0) {
            System.out.println("Stack is empty ");
            return -1;            
        }
        return arr[idx-1];
    }
    int pop(){
        if (idx==0) {
            System.out.println("Stack is empty ");
            return -1;            
        }
        int x=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return x;
    }
    boolean isEmpty(){
        if(idx==0) return true;
        return false;
    }
    int size(){
        return idx;
    }

}


public class ArrayImplementation {
    public static void main(String[] args) {
        Stack st=new Stack(5);
        
        System.out.println("Stack is empty : "+st.isEmpty());
        System.out.println("size:: "+st.size());
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("size:: "+st.size());
        st.push(40);
        st.push(50);
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
