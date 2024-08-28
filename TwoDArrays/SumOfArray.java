package TwoDArrays;
// WAP to sum of element in 2D array
public class SumOfArray 
{
    public static void main(String[] args) 
    {
        int[][] num={{56,64,7},{56,8,1},{2,82,64},{-87,1,3}};
        
        int sum=0;
        for (int i = 0; i < num.length; i++) 
        {

            for (int j = 0; j < num[0].length; j++) 
            {
                sum+=num[i][j];
            }            
        }

        System.out.println("sum of array elements : "+sum);
        
        
    }
    
}
