package Patterns;

import java.util.Scanner;


/*
 *  Pattern printing 
 * Ques: Print the given pattern A B C D 
 *                               A B C D 
 *                               A B C D 
 *                               A B C D  
 *  n=4 
 */
public class AlphabetSquare
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
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        

      sc.close();  
    }
    
}
