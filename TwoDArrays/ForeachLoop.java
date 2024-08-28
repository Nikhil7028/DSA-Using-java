package TwoDArrays;
// for each loop in 2d array
public class ForeachLoop 
{
    public static void main(String[] args)
    {
        int[][] arr={ {2,4,9}, {5,4,7},{8,2,6} };

        for (int[] is : arr) 
        {   // is[] array
            for (int ele: is)   // ele iterate element 
                System.out.print(ele+" ");
            System.out.println();            
        }
        
    }
    
}
