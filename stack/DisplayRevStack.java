
import java.util.Stack;
// Display the stack recursively (using recursion)
//  display and restore
// diplay original order

public class DisplayRevStack {
    public static void rev_display(Stack<Integer> s) {
        if (s.isEmpty())  return;
        int x= s.pop();
        rev_display(s);
        System.out.print(x+" ");
        s.push(x);
        
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        System.out.println("Top :: "+st.peek());
        rev_display(st);
        
    }
    
}
