package Conditionals;
// Take positive integer input and tell if it is even or odd
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if (num%2 == 0)
            System.out.println("Given number is Even");
        else
            System.out.println("Given number is odd");
    }
    
}
