package Arrays_;

// Find the doublet in the array whose sum is
// equal to given value x (two sum)

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] arr={14,4,7,8,1,4};
        int x=9;
        boolean falg=false;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(x==sum)
                {
                    System.out.println("Element found at "+i+"  "+j);
                    falg=true;
                    break;
                }

            }
            if(falg==true)  break;
        }

        

        
    }
    
}
