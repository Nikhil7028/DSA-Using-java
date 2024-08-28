package Loops;

import java.util.Scanner;
//  WAP to print sum of digit of givrn number::::::::
public class SumOfDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        // int count=0;
        int sum=0,rem;
        while (n != 0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }

        System.out.println("Sum of digit : "+sum);
        sc.close();
    }    
}
