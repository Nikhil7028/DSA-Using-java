package TwoDArrays;

import java.util.Scanner;

public class TakeInput2D
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");   
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");   
        int c=sc.nextInt();

        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter element for arr row "+i+" col "+j+" ");

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your entered array: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

        
    }
    
}
