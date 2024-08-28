package Loops;
import java.util.Scanner;

/*  WAP to check if a number is composite or not    (composite means=> Not prime number) 
*  use break keyword;
*/

public class CompositeNo
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num;i++)
        {
            if(num%i == 0)
            {
                System.out.println("Given number is composite number ");
                flag=false;
                break;
            }
            
        }

        if(num ==1) System.out.println("1 is neither composite nor prime");
        else if (flag)   
            System.out.println("Given number is not Composite, it's prime number");
        


        sc.close();

        
    }
    
}
