package Recusion;

import java.util.Scanner;

// Ques: print the series from n to 1 using recusion
public class PrintNto1 {
    public static void print(int n){
        if (n==0)   return;
        System.out.print(n+" ");
        print(n-1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        print(num);
    }
    
}
