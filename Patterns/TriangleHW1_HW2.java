package Patterns;
import java.util.Scanner;
/*
 * HW:
 *  A                       AND         1
 *  A B                                 2 2
 *  A B C                               3 3 3
 *  A B C D                             4 4 4 4
 *                                      5 5 5 5 5
 */
public class TriangleHW1_HW2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
//  ===============================================================
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }         
    }
    
}
