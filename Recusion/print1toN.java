package Recusion;

import java.util.Scanner;

// Ques: print the series from 1 to n using recusion
public class print1toN {
    public static void print(int num){
        if (num==0)   return;
        print(num-1);
        System.out.print(num+" ");
    }
    static int varn=1;
// using third variable
    public static void print1(int num){
        if (num<varn)   return;
        System.out.print(varn+" ");
        varn++;
        print1(num);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        print1(num);
        sc.close();
        
    }
    
}
