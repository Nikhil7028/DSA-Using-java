package strings;

import java.util.Scanner;

public class StringBasic 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a string : ");
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println("This is your String "+str);

         // Consuming the newline character left by next() before using nextLine()
         sc.nextLine();

        System.out.println("Enter your full Name : ");
        String strLine=sc.nextLine();

        System.out.println("Your full name is : "+strLine);

        System.out.println("Length of full name is "+strLine.length());
        System.out.println("Character at the 5 index is "+strLine.charAt(5));
        sc.close();
    }
    
}
