package Loops;

import java.util.Scanner;

//  Display this AP => 4,7,10,13,16....upto 'n' terms (without formula)

public class AP2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  'n' terms : ");
        int n=sc.nextInt();
        int a=4,d=3;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            a+=d;
        }




        sc.close();
    }
    
}
