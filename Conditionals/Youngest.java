package Conditionals;

import java.util.Scanner;


// सर्वात लहान
// If the age of Ram, Shyam and Ajay are input throught the keyboard,
// write a program to determine the youngest of the three (Without using && operator)
public class Youngest 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of Ram , Sham and Ajay : ");
        byte ram=sc.nextByte();
        byte sham=sc.nextByte();
        byte ajay=sc.nextByte();
        if (ram<sham)
        {
            if(ram<ajay)
                System.out.println("The yougest boy is Ram: "+ram);
            else
            System.out.println("The yougest boy is Ajay: "+ajay);
        }
        else if(sham<ajay)
            System.out.println("The yougest boy is Sham: "+sham);            
        else
            System.out.println("The yougest boy is Ajay: "+ajay);
        sc.close();
    }
    
}
