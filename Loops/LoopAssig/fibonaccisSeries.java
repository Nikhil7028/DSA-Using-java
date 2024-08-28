package Loops.LoopAssig;

import java.util.Scanner;
/*
 * Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series. 
 * 
 */
public class fibonaccisSeries
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n term  : ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b);
        int sum=a+b;
// 0 1 1 2 3 5 
        for(int i=2;i<=n;i++)
        {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;b=sum;
        }


    }
    
}
