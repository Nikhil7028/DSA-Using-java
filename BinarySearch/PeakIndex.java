package BinarySearch;
//  NOT completed
/*
 * peak index in mountain array [leetcode 852]
 *  arr={10,20,30,10,50,60,70,20,10}
 */
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,20,10};
        // int[] arr={0,1,0};
        // int[] arr={0,2,1,0};
        // int[] arr={0,10,5,2};
        // int[] arr={24,69,100,99,79,78,67,36,26,19};
        int low=1, high=arr.length-2;
        int peakidx=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                peakidx=mid;
                break;                
            }
            else if (arr[mid] <arr[mid-1] && arr[mid]>arr[mid+1]) {
                high=mid-1;                
            }
            else
                low=mid+1; 

            
        }

        
        System.out.println("Peak index in array is "+peakidx);
    }
}
