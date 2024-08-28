package Patterns.SpecialPattern;
import java.util.Scanner;
//      (n is odd)    
//      _ _ *    
//      _ _ *
//      * * * * * 
//          *    
//          *



public class StarPlus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n odd : ");
        int n = sc.nextInt();
        int mid=n/2;
        mid++;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (i==mid || j==mid)
                {
                    System.out.print("*");                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



        
    }
    
}
