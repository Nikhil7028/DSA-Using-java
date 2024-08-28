package Recusion;

import java.util.Scanner;

// calculate nth term of fibonacci series using recursion
class fabonacci {

    // my solution
    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of n : ");
        int n=sc.nextInt();
        System.out.println("value is "+fib(n));

        
    }
    
}
