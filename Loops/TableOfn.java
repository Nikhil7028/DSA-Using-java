package Loops;

import java.util.Scanner;
//Print the table of 'n' here 'n' is a integer which user will input
public class TableOfn
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int num=sc.nextInt();
        System.out.println("Table of : "+num);
        for(int i=num;i<=num*10;i+=num)
        {
            System.out.println(i);
        }
        sc.close();
    }
    
}
