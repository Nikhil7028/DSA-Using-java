package Conditionals;

import java.util.Scanner;

// Given the length and breadth of a rectangle write a program
// to find whether the area of the rectangle is greater than its perimeter
public class AreaPerimeter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of triangle : ");
        byte l=sc.nextByte();
        System.out.print("Enter breadth of triangle : ");
        byte b=sc.nextByte();

        int area=l*b;
        int para= 2*(l+b);
        if(area>para)
            System.out.println("Area is greater then parameter");
        else
            System.out.println("Parameter is greater than Area");
        sc.close();
    }
    
}
