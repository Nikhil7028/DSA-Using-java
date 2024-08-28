package BinarySearch;
/* Given a sorted integer array and an integer key. find the upper bound is the minimum index such that
 *  (arr[idx]>x)
 * arr={10,20,30,40,50,60,70};
 * input:   30  35  5   80
 * output:  4   4   0   8
 * 
 */
public class UpperBound {
    public static void main(String[] args) {
        
        // int[] arr={10,20,30,40,50,60,70};
        int[] arr={10, 20,  30, 40, 50};
        int key=5;
        int upbound= arr.length ;
        int low=0, high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]>key) {
                upbound= Math.min(mid, upbound);
                high=mid-1;                
            }
            else
                low=mid+1;            
        }
        System.out.println("Upper bound is : "+upbound);
    }
    
}
