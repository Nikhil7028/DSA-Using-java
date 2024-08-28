package Patterns;

import java.util.Scanner;


/*
 *  Pattern printing 
 * Ques: Print the given pattern 1 2 3 4
 *                               1 2 3 4
 *                               1 2 3 4
 *                               1 2 3 4 
 *  n=4 
 */
public class NumberSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        

      sc.close();  
    }
    
}
