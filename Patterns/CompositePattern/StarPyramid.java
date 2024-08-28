package Patterns.CompositePattern;

import java.util.Scanner;

// Print his pattern star pyramid
// Enter n : 7
//             *
//           * * *
//         * * * * *
//       * * * * * * *
//     * * * * * * * * *
//   * * * * * * * * * * *
// * * * * * * * * * * * * * 
public class StarPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=a;k++)
            {
                System.out.print("* ");
            }
            a+=2;
            System.out.println();
        }
        
    }    
}
