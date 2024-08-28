package Loops;

import java.util.Scanner;
//  WAP to check if a number is prime or not
public class PrimeNo
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num;i++)
        {
            if (num%i==0)
            {
                System.out.println("Not a prime");
                flag=false;
                break;                
            }
            
        }
        if( num==1) System.out.println("1 is neither prime nor composite number");
            else if(flag) System.out.println("It is prime number");

        sc.close();
        
    }
    
}
