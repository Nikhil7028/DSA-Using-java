package Basics;

import java.util.Scanner;

public class SumInput
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2=sc.nextInt();

        System.out.println("Addition is: "+(num1+num2));
        sc.close();

        
    }
    
}
