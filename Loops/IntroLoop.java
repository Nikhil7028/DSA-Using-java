package Loops;

import java.util.Scanner;

public class IntroLoop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        byte n=sc.nextByte();
        for(int i=0;i<n;i++)
            System.out.println("Hello World!");
        sc.close();
    }
    
}
