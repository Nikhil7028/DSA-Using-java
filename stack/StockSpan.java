package stack;
import java.util.Stack;

public class StockSpan {
    public static void print(int[] a){
        for (int i : a) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={100, 80, 60, 70, 60,75,85};
        // int[] arr={10,4,5,90,120,80};
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        ans[0]=1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            int idx=st.peek(); // 0 
            if (arr[idx]< arr[i]) {
                while (st.size()>0 && arr[st.peek()]< arr[i]) {
                    st.pop();                    
                }
                if(st.isEmpty())  ans[i]=i+1;
                else  ans[i]= i- st.peek();
            }
            else if(arr[idx]> arr[i]){
                ans[i]=i-idx;
            }
            st.push(i);
        }
        print(arr);
        print(ans);
    }
    
}
