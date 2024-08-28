package BasicSort;
// bubble sort 
public class Bubblesort {
    public static void print(int[] ar)
    {
        for (int i : ar) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int[]  arr={3,1,2,5,4};
        // int[] arr={5,1,3,4,2};
        int[] arr={10,4,1,0,-2}; 
        // int[] arr={1,2,3,4,6,9};
        print(arr);
        int n=arr.length;
        boolean flag=true;
        int external=0, inner=0;
        
        for (int j = 0; j < n-1; j++) {
        
            for(int i=0; i<n-j-1;i++)
            {
                if (arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp;
                    flag=false;
                    
                }
                inner++;
            }
            if (flag)   break;
            external++;
        }
        print(arr);
        System.out.println("External loop : "+external);
        System.out.println("Inner loop : "+inner);

    }
    
}
