import java.util.Stack;
public class Slid_wind_Max {
    public static void print(int[] a) {
        for (int i : a) {
            System.out.print(i+" ");            
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};    // output: 3,3,5,5,6,7
        int k=3;
        System.out.print("Array: ");
        print(arr);

        int len=arr.length;
        int[] nge=new int[len];
        Stack<Integer> st=new Stack<>();
        
        nge[len-1]=len;
        st.push(len-1);
        for (int i = len-2; i>=0; i--) {
            while (st.size()>0 && arr[st.peek()]<arr[i]) 
                st.pop();
            if (st.size()==0)   nge[i]=len;
            else
                nge[i]=st.peek();
            st.push(i);
        }
        System.out.print("nge: ");
        print(nge);


        
        int[] ans=new int[len-k+1];
        int j=0;
        int z=0;
        
        for (int i = 0; i < len-k+1; i++) {
            if (j>=i+k) j=i;
            int max=arr[j];
            while (j<i+k) {
                max=arr[j];
                // System.out.println(max); 
                j=nge[j];                                
            }
            ans[z++]=max;         
        }
        System.out.print("Ans: ");
        print(ans);



    }



    
}
