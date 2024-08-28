package BasicSort;
/*
 * sort a given array in increasing order using selection sort 
 * But in each pass, put kth maximum element at the right
 */
public class SelectionSortHW {
    public static void print(int[] ar)
    {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        int n=arr.length;
        print(arr);
        
        for (int i = 0; i < n; i++) {
            int max=arr[0];
            int maxindx=0;
            // find max element:
            for (int j = i; j < n-i; j++) {
                if(max<arr[j])
                {
                    max=arr[j];
                    maxindx=j;   
                }               
            }
            int lastidx=n-1-i;
            int temp=arr[lastidx];
            arr[lastidx]=arr[maxindx];
            arr[maxindx]=temp;

         
        }
        
        
        print(arr);
        
        
    }
    
}
