package stack;
// push the element at bottom or any index
import java.util.Stack;


public class PushEleidx {
    public static void pushAtidx(Stack<Integer> s,int idx, int a) {
        if (s.size()<idx || idx<0) {
            System.out.println("Invalid index ");
            return;
        }
        
        Stack<Integer> temp=new Stack<>();

        for (int i = s.size()-1; i>=idx; i--) 
            temp.push(s.pop());

        
        s.push(a);
        while (! temp.isEmpty()) 
            s.push(temp.pop());


        

                
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        System.out.println(st);
        // index start from top to bottom
        pushAtidx(st,-1,50);
        System.out.println(st);
    }

    
}
