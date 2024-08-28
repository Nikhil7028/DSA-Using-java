package Loops;

// HW: Print all the odd number from 1 to 100 which are either divible by 5 or 3
public class DivisibleBy5or3
{
    public static void main(String[] args)
    {
        for(int i=0;i<=100;i++)
            if(i%2==1 && (i%5==0 || i%3==0)) System.out.println(i);        
    }
    
}
