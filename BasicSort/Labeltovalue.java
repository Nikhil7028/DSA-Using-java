package BasicSort;
/*
 * input: [54, 11, 28, 91, 47, 63]
 * output:[ 3,  0,  1,  5,  2,  4]
 */
public class Labeltovalue {
    public static void print(int[] ar)
    {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={54, 11, 28, 91, 47, 63};
        // int min= Integer.MIN_VALUE;
        // int min= arr[0];
        int n=arr.length;
        int  sub=0;
        
        print(arr);
        for (int i = 0; i < n; i++) {
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = 0; j < n; j++) {         // find the minimum element from array              
                if (arr[j]<min && arr[j]>0) {
                    min=arr[j];
                    mindx=j; 
                }
            }
            arr[mindx]=sub;
            sub--;
            
            
        }
        print(arr);
        for (int i=0;i<n;i++) {
            arr[i]*=-1;
        }
        print(arr);
    }
    
}
