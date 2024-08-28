package BinarySearch;
import java.util.*;
/*
 * Find the K closest element in array 
 * step 1: Base case if k<0 and k>arr.length
 * step 2: Find out lower bound
 * Step 3: use two pointer
 * step 4: use two loop .....
 */

public class ClosestEle {
    public static List<Integer> Close(int[] arr,int key,int k)
    {
        List<Integer>ans=new ArrayList<>();

        int n=arr.length;

        // Base cases
        if (key<arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);                
            }
            Collections.sort(ans); 
            return ans;
        }
        if (key>arr[n-1]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[n-i-1]);                
            }
            Collections.sort(ans); 
            return ans;
        }
        
        // lower bound
        int lbd=n;
        int low=0, high=arr.length-1;

        while (low<=high) {
            int mid=low+(high-low)/2;
            if (arr[mid]>=key) {
                lbd=mid;
                high=mid-1;                
            }
            else
                low=mid+1;
            
        }
        System.out.println("Lower bound "+lbd);

        // TWO pointer i    and     j
        int i=lbd-1, j=lbd;

        while (i>=0 && (j< n && k>0)) {
            int di=Math.abs(key-arr[i]);
            int dj=Math.abs(key-arr[j]);

            if (di>=dj) {
                ans.add(arr[i]);
                i--;                
            }
            else
            {
                ans.add(arr[j]);
                j++;
            }
            k--;            
        }

        while (i<0 && k>0) {
            ans.add(arr[j]);
            j++;
            k--;            
        }
        while (j>=n && k>0) {
            ans.add(arr[i]);
            i--;            
        }
        
        


        // Arrays.sort(ans); 
        Collections.sort(ans); 

      
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int x=4;  // key
        int k=3; //three number close to (x) 3
        List<Integer>ans=new ArrayList<>();

        ans=Close(arr, x, k);
        for (Integer integer : ans) {
            System.out.print(integer+"_");
            
        }
        System.out.println();

        













        // int[] ans= new int[k];
        // int low=0,high=arr.length, idx=-1;
        // while (low<=high) {
        //     int mid=(low+high)/2;
        //     if (arr[mid]==x) {
        //         idx=mid;
        //         break;                
        //     }
        //     else if (arr[mid]<x) 
        //         low=mid+1;
        //     else
        //         high=mid-1;                
        // }
        // System.out.println("Position of array "+idx);
        // int a=idx-1, b=idx+1;
        // int ansidx=0;
        // ans[ansidx]=arr[idx];
        // ansidx++;
        // while (a>=0 && b<arr.length && ansidx<ans.length) {
        //     if ((x-arr[a])<(arr[b]-x)){
        //         ans[ansidx]=arr[a];
        //         a--;
        //     }
        //     else if ((x-arr[a])==(arr[b]-x)) {
        //         ans[ansidx]=arr[a];
        //         a--;      
        //     }
        //     else
        //     {
        //         ans[ansidx]=arr[b];
        //         b++;
        //     }
        //     ansidx++;                    
        // }
        // for (int i : ans) {
        //     System.out.print(" "+i);
        // }


    }
    
}
