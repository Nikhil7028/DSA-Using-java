package Loops.LoopAssig;
/* 
* Write a Java program to print a multiplication table for a given number 'n'.
*/

import java.util.Scanner;

public class MulOfTable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(i*n));
        }
        
    }
    
}
