// package stack;
import java.util.Stack;
// find the next greates element in array
public class NextGreatEle {
    public static void print(int[] ar) {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        Stack<Integer> st=new Stack<>();
        int len=arr.length;
        int[] ans=new int[len];
        
        ans[len-1]=-1;
        st.push(arr[len-1]);  

        for (int i = len-2; i >=0 ; i--) {
            while(st.size()>0 && st.peek()< arr[i]){
                        st.pop();                    
                }
            if (st.size()==0)
                ans[i]=-1;
            else
                ans[i]=st.peek();
            st.push(arr[i]);
        }
        print(ans);
    }
    
}
