package Loops.LoopAssig;

import java.util.Scanner;

/*
 *  Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop. 
 */
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int min;

        if(a>b)
            min=b;
        else
            min=a;

        while (min > 0)
        {
            if (a%min == 0  &&  b%min == 0)
            {
                break;
            }
            min--;
        }
        System.out.println("Greatest common multiple : "+min);        
    }
    
}
