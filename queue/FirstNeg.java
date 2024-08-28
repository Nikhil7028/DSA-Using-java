package queue;
import java.util.LinkedList;
import java.util.Queue;
// first negative in each window of size 'k'
public class FirstNeg {
    
                               
    public static void print(int[] a){
        for (int i : a) {
            System.out.print(i+" "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr={12,-1,-7,8,-15,30,16,28};
        int[] arr={-8,2,3,-6,10};
        // int[] arr={12,-1,-7,8,15,30,-16,28};
        // int k=3;
        int k=2;
        int n=arr.length;
        // Create ans array
        int[] ans=new int[n-k+1];
        // add negative element in queue
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) 
                q.add(i);            
        }

        for (int i = 0; i <=n-k; i++) {
            int window=i+k-1;
            while (q.size()>0 && q.peek()<i) {
                q.poll();
            }
            if (q.size()>0 && q.peek()>=i && q.peek()<=window) {
                ans[i]=arr[q.peek()];                
            }
            else {
                ans[i]=0;
            }
            
        }
        print(arr);
        print(ans);

        












        // int len=(arr.length-k)+1;
        // int[] ans=new int[len];                  
        // Queue<Integer> q=new LinkedList<>();

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]<0) 
        //         q.add(i);            
        // }
        // System.out.println(q);

        // for (int i = 0; i < arr.length-k; i++) {
        //     int window=i+k-1;
        //     if (q.size()==0) {
        //         ans[idx++]=0;
        //         continue;                
        //     }
        //     if (q.peek() <=window && q.peek()>=i) {
        //         ans[idx++]=arr[q.peek()];                
        //     }
        //     else if (q.peek()<i) {
        //         q.poll();
        //         ans[idx++]=0;                                
        //     }  
        //     else{
        //         ans[idx++]=0;

        //     }  
        // }
        // System.out.println(q);
        // print(ans);

    }
    
}
