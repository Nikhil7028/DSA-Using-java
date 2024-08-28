package Arrays_;

import java.util.Scanner;

public class BasicSyntax 
{
    public static void main(String[] args)
    {
        // int[] arr=new int[6];     //declationation of array

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
    
        System.out.print("Enter Element of array : ");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int i : arr)
        {
            System.out.print(i+" ");
            
        }
        


        
    }
    
}
