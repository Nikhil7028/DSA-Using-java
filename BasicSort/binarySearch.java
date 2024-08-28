package BasicSort;
//     NOT optimize
public class binarySearch {
    public static int search(int[] arr, int k)
    {
        int mid, init=0, n=arr.length-1;
        
        mid=(init+n)/2;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[mid]==k) return mid;
            else if(arr[mid]<k){
                mid=(mid+n)/2;
            }
            
        }
        return -1;
    }

    public static void main(String args[])
    {
        int[] arr={5, 6, 11, 12, 13};
        int key=13;
        int pos= search(arr,key);
        if(pos !=-1)
            System.out.println("Element found at position "+pos);
        else
            System.out.println("Element is not found in array");
        System.out.println(pos);



    }
    
}
