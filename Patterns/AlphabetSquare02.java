package Patterns;

import java.util.Scanner;


/*
 *  Pattern printing 
 * Ques: Print the given pattern a b c   
 *                               a b c 
 *                               a b c 
 *                               a b c   
 *  if n= 3
 */
public class AlphabetSquare02
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
        

      sc.close();  
    }
    
}
