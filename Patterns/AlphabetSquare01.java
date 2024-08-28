package Patterns;

import java.util.Scanner;


/*
 *  Pattern printing 
 * Ques: Print the given pattern A A A A  
 *                               B B B B
 *                               C C C C
 *                               D D D D  
 *  n=4 
 */
public class AlphabetSquare01
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
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        

      sc.close();  
    }
    
}
