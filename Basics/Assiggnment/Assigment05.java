package Basics.Assiggnment;
// Write a Java program to calculate the area of a circle and the simple interest. Take necessary inputs from the user.
import java.util.Scanner;
public class Assigment05
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        float radius=sc.nextFloat();
        double area=3.14*radius*radius;
        System.out.println("Area of circle: "+area);

        System.out.print("Enter principal amount: ");
        float p=sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r=sc.nextFloat();
        System.out.print("Enter time (in years): ");
        float t=sc.nextFloat();
        double si=(p*r*t)/100;
        System.out.println("Simple interest: "+si);          
        sc.close();     
    }
    
}
