package Conditionals;

import java.util.Scanner;

//even or odd using ternary operator
public class TernaryEvenOdd 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println( (num%2)==0 ? "Even" : "Odd");
        scanner.close();
    }

    
}
