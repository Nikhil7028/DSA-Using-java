package Loops.LoopAssig;

import java.util.Scanner;

// Q4. Write a Java program to check if a given string is a palindrome or not using a loop.

public class PalindromStr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");    //nitin
        String name=sc.next();

        boolean flag=true;
        int start=0, end;
        end=name.length() -1;

        while (start != end)
        {
            char s=name.charAt(start);
            if (s != name.charAt(end))
            {
                flag=false;
                break;                          
            }
            start++;
            end--;
        }
        if (flag)
            System.out.println("Palindrone name");        
        else
            System.out.println("Not Palindrone name");
    }
    
}
