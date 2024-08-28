package Method;
// Write a method to count the number of digits in a number and then print the square of this number.

import java.util.Scanner;
 
class DS
{
    int c=0;
    int count_square(int n)
    {        
        while (n != 0)
        {
            n=n/10;
            c++;                                    
        }
        return (c*c);
    }    

    
}

public class DigitSquare 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number  : ");
    int a=sc.nextInt();
    DS d=new DS();
    System.out.println("Square : "+d.count_square(a));


        
    }

    
}
