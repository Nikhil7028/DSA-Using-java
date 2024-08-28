package Patterns;

import java.util.Scanner;

/*
 *  Pattern printing 
 * Ques: Print the given pattern * * * * *
 *                               * * * * *
 *                               * * * * *
 *                               * * * * * 
 *  row=4 and col=5
 */
public class StarRectangle
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and col : ");
        int row=sc.nextInt();
        int col=sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        

    }
    
}
