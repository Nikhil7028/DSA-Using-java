package Patterns.CompositePattern;

import java.util.Scanner;
/*
       Print this pattern
       Enter n : 4
        1 2 3 4 5 6 7
        1 2 3   5 6 7 
        1 2       6 7
        1           7
 
 


 */


public class NumBridge

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();                   //n=7

        for(int i=1;i<=(n*2)-1;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int c=1,a;
        for(int i=1;i<=n-1;i++)
        {
            a=1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(a+" ");
                a++;
            }

            for(int k=1;k<=c;k++)
            {
                System.out.print("  ");
                a++;
            }
            c+=2;


            for(int j=1;j<=n-i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();


        }

    }
    
}
