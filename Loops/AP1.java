package Loops;

import java.util.Scanner;

//Display this ap => 1, 3, 5, 7, 9, ............ upto 'n' terms (Using formula)
public class AP1
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter  'n' terms : ");
        int n=sc.nextInt();
        int a=1,d=2;
        int last=a+(n-1)*d;

        for(int i=a;i<=last;i+=d)
        {
            System.out.print(i+" ");
        }                
    }
    
}
