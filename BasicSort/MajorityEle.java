package BasicSort;

import java.util.Arrays;

/*
 * find out the element whose occurance is more
 * The majority element is the element that appears more than ⌊n / 2⌋ times
 */
public class MajorityEle {
    public static void main(String[] args) {
        // int[] arr={3,2,3};
        int[] arr={2,2,1,1,1,2,2};
        Arrays.sort(arr);
        int maxidx= (arr.length-1)/2;
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        System.out.println("The element whose occurance is more is "+arr[maxidx]);
        
        
    }
    
}
/*
 * solution : if we sort the array and those element at position of n/2 
 * will have majority element 
 */
