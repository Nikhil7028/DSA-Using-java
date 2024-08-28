package BinarySearch;
/*
 * find first and last position of element in sorted array
 */
public class FirstLastPos {
    public static int[] searchRange(int[] arr, int key) {
        //  5,7,7,8,8,10
        //   Key=6
        int lowBound=-1, upBound=-1;
        int low=0, high=arr.length -1;
        
        // find out first position of array
        while (low<=high) {
            int mid=(low+high)/2;
            
            if (arr[mid]==key) {
                lowBound=mid;
                high=mid-1;
                
            }
            else if(arr[mid]<key)
                    low=mid+1;
            else if(arr[mid]>key)
                    high=mid-1;
            
        }

        // findout last position of element
        low=0; high=arr.length-1;

        while (low<=high) {
            int mid=(low+high)/2;
            if (arr[mid]==key) {
                upBound=mid;
                low=mid+1;
                
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else if(arr[mid]>key)
                high=mid-1;
            System.out.println("hi");
            
        }



        int[] ans = {lowBound, upBound};
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = {10, 10, 20, 20, 20, 20, 20, 20, 20, 30, 30, 30, 40, 40};
        // int[] arr={5,7,7,8,8,10};  // case 01
        // int key = 8;
        // int key=6;          // case 02

        int[] arr={};
        int key=0;


        int[] ans = searchRange(arr, key);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
