package BasicSort;
// selection sort 
// sort the array using selection sort algorithm
public class selectionSort {
    public static void print(int[] ar)
    {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr={10, 5, 8, 9, 0, 7};
        int[] arr={3,5,2,1,4};
        print(arr);
        // int inner=0, extern=0;
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            int min= arr[i];
            int mindx=i;
            for (int j = i; j < n; j++) {           //find minimum value
                if (arr[j] < min ) {
                    min=arr[j];
                    mindx=j;                    
                }
            // inner++;                        
            }
            // swap values
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        // extern++;
 
        }
        print(arr);
        // System.out.println("inner "+inner+" extern "+extern);
    }
    
}
