package Merage_Quick;


// merge two sorted arrays
public class MerageSortedArr {
    public static void main(String[] args) {
        int[] a = {10, 30, 50, 60, 80};
        int[] b = {20, 40, 70,  90};
        
        int size=a.length+b.length;
        int[] arr=new int[size];
        int i=0,j=0,k=0;

        while (i< a.length && j<b.length) {
            if (a[i]<b[j]) 
                arr[k++]=a[i++];
            else
                arr[k++]=b[j++];
        }

        while (i<a.length) 
            arr[k++]=a[i++];      

        while (j<b.length) 
            arr[k++]=b[j++];
            
        // Print the merged array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
