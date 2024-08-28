package Loops;

import java.util.Scanner;

//Diaply this GP => 3,12,48...upto 'n' terms

public class GP2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  'n' terms : ");
        int n=sc.nextInt();
        int a=3,r=4;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            a*=r;
        }



        sc.close();        
    }
    
}
