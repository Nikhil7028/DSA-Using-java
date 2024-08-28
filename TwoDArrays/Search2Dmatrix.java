package TwoDArrays;
// search 2 d matrix in with efficent way
public class Search2Dmatrix 
{
    public static void main(String[] args) 
    {
        int [][] arr={{1,4,7,11,15},
                      {2,5,8,12,19},
                      {3,6,9,16,22},
                      {10,13,14,17,24},
                      {18,21,23,26,30}  };
        int target=13;
        boolean check=true;   // means not found
        int i=0,j=arr[0].length-1;
        while (i<arr.length && j>=0) 
        {
            if(arr[i][j] == target)
            {
                System.out.print("Element found at "+i+" "+j);
                check=false;
                break;
            }
            else if(arr[i][j]>target )
            {
                j--;                
            }
            else if(arr[i][j]<target)
            {
                i++;
            }
            
        }
        if(check)
        {
            System.out.println("Given elemnt is not found");
        }

    }
    
}
