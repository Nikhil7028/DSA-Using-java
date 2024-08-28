package Method;

import java.util.Scanner;
// Given two numbers a and b, write a method to print all odd numbers between them.
class OddNum
{
    void odd(int x,int y)
    {
        for(int i=x;i<=y;i++)
        {   if(i%2 !=0)
            System.out.print(i+" ");
        }
    }
}
public class OddBetNumber
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter two number  : ");
     int a=sc.nextInt();
     int b=sc.nextInt();

     OddNum on=new OddNum();
     on.odd(a, b);//..................................    
        
    }
    
}
