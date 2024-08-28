package Arrays_;

import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter element of array : ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();            
        }
        
        System.out.print("Enter a target ");
        int target=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(target==arr[i])
            {
                
                System.out.print("element found at index number : "+i);
                break;
            }
       }
    }
    
}
