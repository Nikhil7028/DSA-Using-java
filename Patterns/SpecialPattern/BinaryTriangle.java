package Patterns.SpecialPattern;

import java.util.Scanner;

// Print this patter
// Enter n : 4
// 1
// 01
// 101
// 0101

public class BinaryTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int counter;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1) counter=1;
            else counter=0;
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter);
                if(counter==1) counter=0;
                else counter=1;
            }
            System.out.println();


        }        


        sc.close();
    }
    
}
