
/**
 * Randomoze quick sort in this pivot =s(lo+hi)/2
 */
public class RandQuickSort {
    public static void print(int[] arr) {
        for (int ele : arr) 
            System.out.print(ele+" ");
        System.out.println();
    }
    public static void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;        
    }
    
    public static void partition(int[] arr, int lo, int hi, int pivIdx) {
        int i=lo, j=hi;

        while (i< pivIdx && j>pivIdx) {
            if (arr[i]<arr[pivIdx])
                i++;
            else if(arr[j]>arr[pivIdx])
                j--;
            else if(arr[i]>arr[pivIdx] && arr[j]<arr[pivIdx]){
                swap(arr, i, j);
                i++;
                j--;
            }          
        }
    }
    public static void quick_Sort(int[] arr, int lo, int hi) {
        if (lo>=hi) 
            return;
        int pivIdx=(lo+hi)/2, small=0;
        for (int i = lo; i <=hi; i++){
            if (arr[i]<arr[pivIdx]) 
                small++;
        }
        swap(arr,pivIdx,lo+small);
        pivIdx=lo+small;
        print(arr);
        partition(arr,lo, hi, pivIdx);
        quick_Sort(arr,pivIdx+1,hi);
        quick_Sort(arr,lo,pivIdx-1);


    }
    public static void main(String[] args) {
        int[] arr={18, 12, 30, 16, 35, 20};
        // int[] arr={10, 50, 80, 30, 70, 20};
        print(arr);
        int n=arr.length;
        quick_Sort(arr,0,n-1);
        print(arr);

    }
}