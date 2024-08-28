package BasicSort;

import java.util.Arrays;
// Program of sort an array by using build in method
public class buildInsort 
{
    public static void main(String[] args) {
        int[] arr={4,21,54,62,55,25,25,32,32,0};
        Arrays.sort(arr);
        for( int ele: arr)
        {
            System.out.print(ele+" ");
        }

    }
    
}
