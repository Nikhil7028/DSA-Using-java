package strings;

import java.util.Scanner;

//Count the number of digits in a number without using loop:
public class CountDigit 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        String str=sc.next();
        System.out.println("Total number of digits "+str.length());
        sc.close();
        
    }
    
}
