package stack;

import java.util.Stack;

public class PrevGreatEle {
    public static void print(int[] a){
        for (int ele : a) {
            System.out.print(ele+" "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr={10,20,30,40};
        int[] arr={10,4,2,20,40,12,30};
        int[] ans= new int[arr.length];
        Stack<Integer> st=new Stack<>();
        
        ans[0]=-1;
        st.push(arr[0]);

        for (int i=1;i<arr.length; i++) {
            while (! st.isEmpty() && st.peek()<arr[i]) {
                st.pop();                    
            }
            if (st.isEmpty()) ans[i]=-1;
            else ans[i]= st.peek();
            st.push(arr[i]);
        }
        print(ans);

    }
    
}
