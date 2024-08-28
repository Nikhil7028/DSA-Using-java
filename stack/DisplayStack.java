// package stack;

import java.util.Stack;

public class DisplayStack {
    public static void disply(Stack<Integer> s){
        if (s.isEmpty()) return;
        System.out.println(s.pop());
        disply(s);



    }
    public static void main(String[] args) {
        
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // // diplay the element using the loop
        // while (!st.isEmpty()) {
        //     System.out.print(st.pop()+" ");
            
        // }

        // diplay the element using the recursion
        disply(st);
    }
    
}
