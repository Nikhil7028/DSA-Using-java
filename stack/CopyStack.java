// package stack;

import java.util.Stack;

// copy the stack into another stack in same order
public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> org_st=new Stack<>();
        org_st.push(10);
        org_st.push(20);
        org_st.push(30);
        org_st.push(40);
        org_st.push(50);
        System.out.println("original stack: "+org_st);

        //create a temprary stack
        Stack<Integer> temp_st=new Stack<>();
        while (! org_st.isEmpty()) 
            temp_st.push(org_st.pop());

        //create a copy stack
        Stack<Integer> copy_st=new Stack<>();
        while (! temp_st.isEmpty()) 
            copy_st.push(temp_st.pop());

        System.out.println("Copy stack: "+copy_st);
        
    }
    
}
