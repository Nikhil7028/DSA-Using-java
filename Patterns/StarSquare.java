package Patterns;

import java.util.Scanner;


/*
 *  Pattern printing 
 * Ques: Print the given pattern * * * * *
 *                               * * * * *
 *                               * * * * *
 *                               * * * * *
 *                               * * * * * 
 *  n=4 
 */
public class StarSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        

        
    }
    
}
