package BasicSort;
/*  leetcode move zeros : 283
    input:num=[0,1,0,3,12]
    output:num= [1,3,12,0,0]
*/
public class MoveZero 
{
    public static void main(String[] args) 
    {
        int[] arr={0,1,0,3,12};

        for (int j = 0; j < arr.length-1; j++) {
            
            for (int i = 0; i < arr.length-j-1; i++) 
            {
                if (arr[i] ==0)
                {
                    int temp= arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]= temp; 
                    
                    
                }
                
            }
        }

        for (int ele : arr) {
            System.out.print(ele+" ");            
        }
        
    }
}
    

