package stack;
// import stack library
import java.util.Stack;

// class implementation using standared library

public class Stack_SL {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        System.out.println("stack is empty "+st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        // remove the element
        System.out.println("Remove the element : "+st.pop());
        System.out.println("size:: "+st.size());
        // print the top element
        System.out.println("Top element in the stack :: "+st.peek());
        System.out.println(st);
        
        System.out.println("stack is empty:: "+st.isEmpty());

        
    }
    
}
