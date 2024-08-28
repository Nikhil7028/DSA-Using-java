package Basics;

public class VariableUpdating
{
    public static void main(String[] args)
    {
        int x=5;
        System.out.println(x);
        x=7;
        System.out.println(x);
        x=x+6;

        System.out.println(x);
        x=x-20;
        System.out.println(x);

        //shotcut to print
        int y=20;
        y+=10; //means: y=y+10  
        System.out.println(y);

        y-=2;
        System.out.println(y);
        
    }
    
}
