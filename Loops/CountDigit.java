package Loops;

import java.util.Scanner;

// WAP to count digit of a given number
// 5187  => 4 digit
public class CountDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int count=0;

        while (n !=0)
        {
            n=n/10;
            count++;    
        }
        System.out.println("Total digit : "+count);

        sc.close();
                
    }
    
}
