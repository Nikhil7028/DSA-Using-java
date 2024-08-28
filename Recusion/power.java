package Recusion;

import java.util.Scanner;

// Question calculate the a raise to power b using recursion 
public class power {
    public static int powerab(int a, int b){
        if (b==0)   return 1;
        return a*powerab(a, b-1);

    }

    // Fastes way to calculate 
    public static int powerab2(int a, int b){
        if (b==0)   return 1;
        int ans=powerab2(a, b/2);
        if (b%2==0) return ans*ans;
        else return ans*ans*a;

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of a raise to b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(a+" raise to "+b+" is "+powerab2(a, b));
        sc.close();
        
    }
    
}
