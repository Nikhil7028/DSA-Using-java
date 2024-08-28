package BinarySearch;
/*
Given a sorted integer array and an integer key, find the lower bound of key (Smallest ondext such that arr[idx]>=key )
 * 10,20,30,30,40,50,60,70
 * input  : 40  30  35  25  80  5 
 * output : 4   2   4   2   8   0
 */
public class LowerBound {
    public static void main(String[] args) {
        int[] arr={ 10,20,30,30,40,50,60,70};
        int key=80;
        int lowbound=8;
        int low=0, high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>=key)
            {
                lowbound=Math.min(lowbound, mid);
                high=mid-1;
            }
            else
                low=mid+1;           
        }
        System.out.println("Lower bound is : "+lowbound);
    }
    
}
