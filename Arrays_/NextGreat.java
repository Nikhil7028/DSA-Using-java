package Arrays_;

//
class NextGreat 
{
    public static void main(String[] args)
    {
        int[] arr={12,8,41,37,2,49,16,28,21};
        int[] ans=new int[arr.length];
        
        // Brute foures
        for(int i=0;i<arr.length;i++)
        {
            int maxint= -1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>maxint)
                    maxint=arr[j];
            }
            ans[i]=maxint;
        }


        for (int i : ans)
        {
            System.out.print(" "+i);            
        }
    }
    
}
