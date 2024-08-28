package TwoDArrays;
// WAP to find the largest element in 2D array
public class LargeElement 
{
    public static void main(String[] args) 
    {
        int[][] num={{56,64,7},{56,8,1},{2,82,64},{87,1,3}};
        
        int mx=num[0][0];
        for (int i = 0; i < num.length; i++) 
        {

            for (int j = 0; j < num[0].length; j++) 
            {
                if(num[i][j]>mx)
                    mx=num[i][j];
                                
            }            
        }

        System.out.println("Largest elements in array : "+mx);
        
        
    }
    
}
