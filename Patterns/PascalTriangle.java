package Patterns;
//pascal Triangle print
// 1
// 121
// 1231
// 12341

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n+1;i++)
        {
            for (int j = 1; j < i; j++) 
                System.out.print(j);                
            
            System.out.println(1);
        }
        
    }
    
}
