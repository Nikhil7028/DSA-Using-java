package Arrays_;

//Write a program to reverse the array without using any extra array;
public class ReversArray
{
    public static void main(String[] args)
    {
        int[] arr={11,22,33,44,55,700,66,77,88,99,00};
        int n=arr.length;
        int j=n-1;

        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];            
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for (int i : arr)
        {
            System.out.print(i+" ");
            
        }
        
        
    }
    
}
