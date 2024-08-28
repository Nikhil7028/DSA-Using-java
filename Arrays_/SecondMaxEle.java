package Arrays_;


// Find the second largest element in the given array:

public class SecondMaxEle
{
    public static void main(String[] args)
    {
        int[] arr={10,1,-2,4,-6,19,2,38};
        int max=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                Smax=m
                max=arr[i];                
            }
            if (arr[i]<max && arr[i]>Smax) {
                Smax=arr[i];                
            }
            
        }

        System.out.println("First laegest number: "+max);
        System.out.print("Second laegest number: "+Smax);
        
    }
    
}
