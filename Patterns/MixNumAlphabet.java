package Patterns;
import java.util.Scanner;
/*
 * (if n=5) 
 *          1
 *          A B
 *          1 2 3 
 *          A B C D
 *          1 2 3 4 5 
 */
public class MixNumAlphabet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        
            for(int i=1;i<=n;i++)
            {
                if(i%2 ==1)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                else{
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print((char)(j+64)+" ");
                    }
                    System.out.println();

                }
            }

        
    }
    
}
