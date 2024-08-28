package BasicSort;
// sort thr array using insertion sort
public class insertionSort {
    public static void print(int[] ar)
    {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void swap(int[] a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        // int[] arr={12, 11, 13, 5, 6};       //avg
        int[] arr={13,12,11,6,5};       //worst case
        // int[] arr={5,6,11,12,13};       //best case
        // int[] arr={4,3,2,10,12,1,5,6};
        // int[] arr={9,8,7,6,5,4,3,2,1,0};
        int ineer=0, extern=0;
        int n=arr.length;
        print(arr);
        /**************   MY solution ****   On the basis of no. of operation my solution is best    */
        for (int j = 0; j < n-1; j++) {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
                for (int k = j; k > 0; k--) {
                    if (arr[k]<arr[k-1]) {
                        temp= arr[k];
                        arr[k]=arr[k-1];
                        arr[k-1]= temp;
                    }
                ineer++;       
                }
            } 
            extern++;
        }

        /*      PW skill solution */

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j >=1; j--) {
        //         if (arr[j]<arr[j-1])
        //             swap(arr, j, j-1);
        //         else
        //             break;
        //     ineer++;
        //     }
        //     extern++;
        // }

        print(arr);
        System.out.println("ineer   "+ineer+" :: extern "+extern);
    }
    
}
