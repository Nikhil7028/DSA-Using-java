package Patterns.SpecialPattern;
import java.util.Scanner;
/*
 *          1
 *          1 3
 *          1 3 5
 *          1 3 5 7
 *          1 3 5 7 9
 * 
 */
public class OddNumTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a;
        for(int i=1;i<=n;i++)
        {
            a=1;
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
                
    }
    
}
