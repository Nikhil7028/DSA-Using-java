package Patterns.CompositePattern;
import java.util.*;
/*
 *  print given pattern
 * Enter n : 5
        1 
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
  
 */
public class NumPyramidPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int k;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            
            for(k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            k-=2;
            for(;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            
            System.out.println();
        }
        sc.close();
        
    }    
}
