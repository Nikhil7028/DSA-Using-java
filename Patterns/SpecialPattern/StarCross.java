package Patterns.SpecialPattern;
import java.util.Scanner;
//      (n is odd)    
// *       *
//   *   *
//     *
//   *   *
// *       *


public class StarCross
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n odd : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (i==j || j==n+1-i)
                {
                    System.out.print("* ");                    
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        
    }
    
}
