package BasicSort;
/*
 * Sort a given array in descending order using bubble sort
 */
public class BubbleSortDesc {
    public static void print(int[] ar)
    {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr={3,1,2,5,4};
        int[] arr ={1,0,-2,10,4};
        int n=arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;
                }
                
            }
                        
        }
        print(arr);
        
    }
    
}
