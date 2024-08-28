package stack;
import java.util.Stack;

// reverse the stack
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> org_st=new Stack<>();
        org_st.push(10);
        org_st.push(20);
        org_st.push(30);
        org_st.push(40);
        System.out.println("Original stack: "+ org_st);
        //Reverse stack
        
        Stack<Integer> rev_st=new Stack<>();
        
        while (! org_st.isEmpty()) 
            rev_st.push(org_st.pop());

        System.out.println("Reverse stack: "+rev_st);

        
    }
    
}
