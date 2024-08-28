package Conditionals;

import java.util.Scanner;
//Take integer input and print the absolute value of that integer
public class AbsoluteNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        byte num= sc.nextByte();
        
        if(num <0)
            System.out.println("The absolute number : "+(-num));
        else
            System.out.println("Given number is absolute number "+num);
        sc.close();        
    }
    
}
