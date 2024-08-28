package Basics;

import java.util.Scanner;

// calculate the area of circle take inout from user
public class AreaOfCircleInput
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of circle : "+area);        
        sc.close();
    }
    
}
