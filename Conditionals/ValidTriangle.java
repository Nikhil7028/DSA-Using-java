package Conditionals;
//  Triangle OR NOT

import java.util.Scanner;
public class ValidTriangle
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three side of trianle : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a<(b+c)) System.out.println("Valid triangle");
        
        if(b<(a+c)) System.out.println("Valid triangle");
        if(c<(b+a)) System.out.println("Valid triangle");
        sc.close();
    }
    
}
