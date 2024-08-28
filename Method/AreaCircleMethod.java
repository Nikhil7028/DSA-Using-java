package Method;

import java.util.Scanner;

// Write a method that takes the radius of a circle as an argument and returns its area

class CalAreaCircle
{
    double AreaC(float rad)
    {
        double Area=3.14*rad*rad;
        return Area;

    }
}

class AreaCircleMethod
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a radius : ");
     float r=sc.nextInt();
     CalAreaCircle cac=new CalAreaCircle();
     System.out.println("Area of circle : "+cac.AreaC(r));

        
    }
    
}
