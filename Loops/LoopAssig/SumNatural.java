package Loops.LoopAssig;

import java.util.Scanner;

//Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'. 
public class SumNatural 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int sum=0;

        for (int i=0; i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum : "+sum);   
    }   
}
