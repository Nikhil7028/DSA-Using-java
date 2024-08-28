package TwoDArrays;
/**
 * Basic of two dimentional array in java
 */
public class Basic 
{
    public static void main(String[] args) 
    {
        int[][] arr= {{21,1},{7,8}};
        
        
        for (int[] is : arr) 
        {
            for (int ele : is) {
                System.out.print(ele+" ");
                
            }
            System.out.println();
            
        }

        
    }   
    
}