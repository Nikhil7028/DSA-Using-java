package Conditionals;
import java.util.Scanner;
/**
 * DivisibleBy5or3
 * Take positive integer input and tell if it is divisible by 5 or 3
 */
public class DivisibleBy5or3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        sc.close();

        if(num%5 ==0 || num%3==0)
            System.out.println("Given number is divisible by 5 or 3");
        else
            System.out.println("Given number is NOT divisible by 5 or 3");

        
    }

    
}