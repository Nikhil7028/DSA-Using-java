package Conditionals;

import java.util.Scanner;
//Take a positive integer input and print the greater of them
public class GreaterNumThree
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        if (num1>num2)
        {
            if(num1>num3)
                System.out.println("The greater number is "+num1);            
        }
        else if(num2>num3)
            System.out.println("The greater number is : "+num2);
        else
            System.out.println("Greater number is : "+num3);
        sc.close();
    }
    
}
