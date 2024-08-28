package Loops;

import java.util.Scanner;

//Diaply this GP =>  1,2,4,8,16,32, .....upto 'n' terms

public class GP1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  'n' terms : ");
        int n=sc.nextInt();
        int a=1,r=2;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            a*=r;
        }



        sc.close();        
    }
    
}
