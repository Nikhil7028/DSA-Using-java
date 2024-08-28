package Conditionals;
// Take positive integer input and tell if it is a five digit 
// number or NOT
import java.util.Scanner;
public class FiveDigitNum
{
    public static void main(String[] args)
    {
        // int num=new Scanner(System.in).nextInt();
        System.out.print("Enter number: ");
        int num=new Scanner(System.in).nextInt();
        if(num>9999 && num<=99999)
            System.out.println("Given number is five digit");
        else
            System.out.println("Number is not five digit");

        


        
    }
    
}
