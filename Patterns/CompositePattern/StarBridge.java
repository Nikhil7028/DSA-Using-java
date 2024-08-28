package Patterns.CompositePattern;
import java.util.Scanner;
/*
Print the given pattern
Enter n : 5
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

*/

public class StarBridge {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=(n*2)-1;i++)
        {
            System.out.print("* ");           // first line
        }
        System.out.println();

        int a=1;
        for(int i=1;i<n;i++)
        { 
                   
          for(int j=1;j<=n-i;j++)
          {
            System.out.print("* ");
          }

          for(int k=1;k<=a;k++)
          {
            System.out.print("  ");
          }
          a+=2;
          
          for(int j=1;j<=n-i;j++)
          {
            System.out.print("* ");
          }
          System.out.println();
          
        }
    }
    
}
