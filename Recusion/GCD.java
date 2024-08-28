package Recusion;

import java.util.Scanner;

// calculate the gcd by using recusion

public class GCD {      //24 60
    // fastest method
    public static void gcd(int a, int b){
        if(b==0){
            System.out.println("the greates comman factor is :  "+a);
            return;        
        }
        int rem=a%b;
        gcd(b,rem);
    }

    // slow method
    public static void hcf(int a, int b){
        for (int i = Math.min(a, b); i >0; i--) {
            if (a%i==0 && b%i==0 ) {
                System.out.println("the greates comman factor is :  "+i);
                break; 
                
            }

            
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number greater a and smaller b : ");    
        int a=sc.nextInt();
        int b=sc.nextInt();
        // 60 24
        gcd(a,b);
        // hcf(a,b);
        sc.close();
    }
    
}
