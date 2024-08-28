package Conditionals;
/*
 * Given a point (x,y), write a program to find out if it lies in the 1st, 2nd, 3rd, 4th quadrant,
 * on the x-axis, y-axis or at the origin, viz (0,0)
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Quadrant
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of x and y : ");
        float x=sc.nextFloat();
        float y=sc.nextFloat();

        if(x==0 && y==0)
            System.out.println("Point lies on the Origin");
        else if(x==0 && y!=0)
            System.out.println("Point lies on the x-axis");
        else if(x!=0 && y==0)
            System.out.println("Point lies on y-axis");
        else if(x>0 && y>0)
            System.out.println("Point lies in I Quadrant");
        else if(x<0 && y>0)
            System.out.println("Point lies in II Quadrant");
        else if(x<0 && y<0)
            System.out.println("Point lies in III Quadrant");
        // else if(x>0 && y<0)
        else
            System.out.println("Point lies in IV Quadrant");

        sc.close();
    }
    
}
