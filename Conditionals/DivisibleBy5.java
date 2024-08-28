package Conditionals;

import java.util.Scanner;

//  HW: Take positive integer input and tell if it is divisible by 5 or not
public class DivisibleBy5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        if (num%5==0)
            System.out.println("Given number is divisible by 5");
        else
            System.out.println("Given number is NOT divisible by 5");
        sc.close();
    }
    
}
