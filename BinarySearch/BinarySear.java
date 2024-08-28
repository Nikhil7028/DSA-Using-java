package BinarySearch;
/*
 * Search the element by using binary search whose time complexity is O(logn) Leetcode:704
 */
public class BinarySear {
    public static void main(String[] args) {
        int[] arr={10, 15, 21, 34, 81 ,105, 180, 500};
        int key=500;
        int low=0, high=arr.length-1, pos=-1;

        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]==key) 
            {
                pos=mid;
                break;
            }
            else if(arr[mid]>key)
                    high=mid-1;
            else if(arr[mid]<key)
                    low=mid+1;
            
        }
        if(pos != -1)
            System.out.println("Element is found at position "+pos);
        else
            System.out.println("Element is not found");
        
    }
    
}
