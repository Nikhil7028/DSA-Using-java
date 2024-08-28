// package stack;
import java.util.ArrayList;
// implement stack using arrayList
class Stackl{
    int idx=0;
    ArrayList<Integer> arr;
    Stackl(int size){
        arr=new ArrayList<>(size); 
    }
    public void push(int ele){
        if(arr.size()<=idx){
            System.out.println("Stack is Overflow");
            return;
        }
        arr.add(idx++, ele);
    }
    void diplay(){
            System.out.print(arr);
        System.out.println();
    }
    int peek(){
        if (idx==0) {
            System.out.println("Stack is empty ");
            return -1;            
        }
        return arr.get(idx-1);
    }
    int pop(){
        if (idx==0) {
            System.out.println("Stack is empty ");
            return -1;            
        }
        int x=arr.get(idx-1);
        arr.set(idx-1, 0);
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

public class ArrayListImplementation {
    public static void main(String[] args) {
        Stackl st=new Stackl(5);
        
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
