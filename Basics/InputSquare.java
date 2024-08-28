package Basics;
/**
 * InputSquare take inout from user and print square of number
 */

import java.util.Scanner; 
public class InputSquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int square=num*num;
        System.out.println("Square of "+num+" is: "+square);
        sc.close();

    }

    
}