package Conditionals;

import java.util.Scanner;

//Take positive integer input and tell if it is a
// Three digit number or NOT
public class ThreeDigitNum
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num>99 && num<=999)
            System.out.println("Given number is three digit number");
        else
            System.out.println("Given number is not three digit");
                
        sc.close();
    }
    
}
